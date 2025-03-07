# 更新日志

* 关注公众号 **[开源阅读]** 菜单•软件下载 提前享受新版本。
* 关注合作公众号 **[小说拾遗]** 获取好看的小说。

## **必读**

【温馨提醒】 *更新前一定要做好备份，以免数据丢失！*

* 阅读只是一个转码工具，不提供内容，第一次安装app，需要自己手动导入书源，可以从公众号 **[开源阅读]**、QQ群、酷安评论里获取由书友制作分享的书源。
* 正文出现缺字漏字、内容缺失、排版错乱等情况，有可能是净化规则或简繁转换出现问题。
* 漫画源看书显示乱码，**阅读与其他软件的源并不通用**，请导入阅读的支持的漫画源！

**2023/04/02**

* 更新cronet: 112.0.5615.100
* 更新cronet: 112.0.5615.47
* 添加文字下划线
* 其它一些优化
* 其中一些更新由 Xwite, Horis提供

**2023/04/01**

* 原app最低支持版本提升到android7.0
* 创建lollipop版本支持android5.0
* 增加内置文件管理,管理私有文件
* 书籍分组增加允许下拉刷新设置

**2023/03/29**

* 修复低于android7.0版本无法恢复备份的问题
* 修复低版本安卓崩溃的问题

**2023/03/28**

* 更新cronet: 111.0.5563.115
* 更新rhino: 1.7.14-2
* 修复bug
* 详情页下拉刷新
* 导出为本地文件时不保留vip标识
* 列表结果为NativeObject时支持{{}}@get@put##规则

```
{bookId: 1}
https://www.example.com/book/{{result.bookId}}
```

* 书架整理搜索支持分类和简介
* 其中一些更新由 Xwite, Horis提供

**2023/03/21**

* 修复书签界面删除条目后界面错乱bug
* 一些带有搜索框的界面自动隐藏软键盘
* 本地书籍和远程书籍导入界面支持压缩包
* 内置了两个直链上传配置,可以通过导入默认切换
* 修复无法导入不在数组内的单个书源的本地文件
* getVariable() 默认返回 ""
* 修复bug
* 其中一些更新由 Xwite, Horis提供

**2023/03/14**

* 更新cronet: 111.0.5563.57
* 优化文件型书源,解决压缩文件编码不是UTF-8报错问题
* js添加非对称加密和签名算法
* 文件类书源支持zip 7z rar4解压
* java.ajax(url: Any)自动判断是列表还是字符串
* 修复一些bug
* 其中一些更新由 Xwite, Horis, ag2s20150909 提供
* 修复js加密算法

**2023/03/12**

* 远程书籍添加webDav多配置
* 更新文件类书源详情页界面逻辑
* 尝试修复语音朗读
* 修复特定情况下书籍导入界面计数错误
* 修复阅读界面导航栏更新不及时
* 修复某些以空白开头的链接的拼接
* 修复某些空白备份恢复的错误弹窗
* 修复章节都在一个xhtml里面的epub的内容解析
* 修复某些epub文件里不规范html文档的解析
* 本地备份也采用压缩包,和webDav备份保持一致,从webDav下载的备份文件不需要解压可以直接恢复
* 本地书籍和远程书籍界面添加筛选功能
* 其中一些更新由 Horis 和 Xwite 提供

**2023/03/03**

* 朗读速度添加数值显示
* 章节进度添加xx/yyy格式
* 远程书籍单独配置webDav,多个webDav看情况再添加

**2023/02/27**

* 优化新建书源和订阅源的默认值和退出时的修改判断
* 优化分组更新时界面刷新
* 一些优化 by Horis

**2023/02/22**

* 添加自定义字典规则
* 一些优化 by Horis

**2023/02/16**

* 更新cronet: 110.0.5481.65
* 添加清除 WebView 数据 by Horis
* 用到通知的时候才提示通知权限获取
* 修改订阅源编辑界面和书源一样
* 一些优化 by Horis 和 Xwite

**2023/02/09**

* 添加通知权限设置提示
* 更新日志添加关闭按钮
* 订阅源添加黑名单和白名单,为列表用,分隔支持正则,如果有黑名单,黑名单匹配返回空白, 没有黑名单再判断白名单,在白名单中的才通过, 都没有不做处理
* 更新web编辑；web书架章节序号更改后会**同步序号**，更精确的已读字数同步请**返回书架界面** by Xwite

**2023/01/31**

* web书架: 修复进度bug和章节跳转bug，段落内嵌文字图片懒加载 by Xwite

**2023/01/29**

* 优化英文两端对齐排版
* web书架：进度同步精确到已读字数，返回书架时同步app by Xwite
* 一些优化 by Horis

**2023/01/20**

* web书架不限制最大宽度 by Xwite
* 一些优化 by Horis

**2023/01/10**

* 其他一些有分组的地方也支持独立排序
* 优化搜索,优化缓存,尝试解决部分书源占用内存过大导致OOM
* 修复中文AndroidZipFile不能读取非ASCII字符文件名 by ag2s20150909
* 其它一些优化

**2023/01/06**

* 书架分组支持独立排序
* 适配 android 13 主题图标
* 一些优化 by Horis
----
* [2022年日志](https://github.com/gedoor/legado/blob/record2022/app/src/main/assets/updateLog.md)
* [2021年日志](https://github.com/gedoor/legado/blob/record2021/app/src/main/assets/updateLog.md)
