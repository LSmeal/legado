package io.legado.app.model

import com.google.gson.reflect.TypeToken
import com.script.SimpleBindings
import io.legado.app.constant.SCRIPT_ENGINE
import io.legado.app.exception.NoStackTraceException
import io.legado.app.help.http.newCallStrResponse
import io.legado.app.help.http.okHttpClient
import io.legado.app.utils.ACache
import io.legado.app.utils.GSON
import io.legado.app.utils.MD5Utils
import io.legado.app.utils.Rhino
import io.legado.app.utils.isAbsUrl
import io.legado.app.utils.isJsonObject
import org.mozilla.javascript.Scriptable
import splitties.init.appCtx
import java.io.File
import java.lang.ref.WeakReference
import kotlin.collections.set

object SharedJsScope {

    private val cacheFolder = File(appCtx.filesDir, "shareJs")
    private val aCache = ACache.get(cacheFolder)

    private val scopeMap = hashMapOf<String, WeakReference<Scriptable>>()

    suspend fun getScope(jsLib: String?): Scriptable? {
        if (jsLib.isNullOrBlank()) {
            return null
        }
        val key = MD5Utils.md5Encode(jsLib)
        var scope = scopeMap[key]?.get()
        if (scope == null) {
            val context = SCRIPT_ENGINE.getScriptContext(SimpleBindings())
            scope = SCRIPT_ENGINE.getRuntimeScope(context)
            Rhino.use {
                if (jsLib.isJsonObject()) {
                    val jsMap: Map<String, String> = GSON.fromJson(
                        jsLib,
                        TypeToken.getParameterized(
                            Map::class.java,
                            String::class.java,
                            String::class.java
                        ).type
                    )
                    jsMap.values.forEach { value ->
                        if (value.isAbsUrl()) {
                            val fileName = MD5Utils.md5Encode(value)
                            var js = aCache.getAsString(fileName)
                            if (js == null) {
                                js = okHttpClient.newCallStrResponse {
                                    url(value)
                                }.body
                                if (js !== null) {
                                    aCache.put(fileName, js)
                                } else {
                                    throw NoStackTraceException("下载jsLib-${value}失败")
                                }
                            }
                            evaluateString(scope, js, "jsLib", 1, null)
                        }
                    }
                } else {
                    evaluateString(scope, jsLib, "jsLib", 1, null)
                }
            }
            scopeMap[key] = WeakReference(scope)
        }
        return scope
    }

}