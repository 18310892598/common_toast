背景：Android乘客端和司机端需要做UI统一

概述具备能力：支持提示成功、失败、警告和加载四种通用UI
1. Android toast弹出框


```java
第一步骤
//添加依赖
api 'com.ole.libtoast:toast:1.0.3'

说明:1、最新版本1.3解决了toast所依赖的上下文出现被销毁或者回收的时候调用toast
引发的crash
2、增加了参数，支持toast原声的长时间显示和短时间显示（参数0:短时间显示  1:表示长时间显示）


 
```
```java
第二步骤

   /**
     * 自定义成功弹出toast，参数如下说明
     * @param context 当前依赖上下文
     * @param   title 显示的内容             
     * @param  toastType :0 默认为 LENGTH_SHORT  1：则表示LENGTH_LONG
     */
T.showFailCustomImage(context,title,toastType);

------------------------------------------------
举例：

1、失败弹出toast
 T.showFailCustomImage(this,"123123123",0);
2、成功toast提示
 T.showSuccessCustomImage(this,"123123123",0);
3、加载中toast
 T.showloadingCustomImage(this,"123123123",0);
4、警告toast
 T.showWrongCustomImage(this,"123123123",0);
5、通用没有图片的toast展示
T.showCustomView(this,"1123132",0);

 其他具备能力：

说明：开发具体UI说明链接地址
https://confluence.olafuwu.com/pages/viewpage.action?pageId=19019340

```