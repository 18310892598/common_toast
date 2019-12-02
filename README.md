背景：Android乘客端和司机端需要做UI统一

概述具备能力：支持提示成功、失败、警告和加载四种通用UI
1. Android toast弹出框


```java
第一步骤
//添加依赖
api 'com.ole.libtoast:toast:1.0.0'

 
```
```java
第二步骤

直接调用,四种调用方法，this当前上下文

1、失败弹出toast
 T.showFailCustomImage(this,"123123123");
2、成功toast提示
 T.showSuccessCustomImage(this,"123123123");
3、加载中toast
 T.showloadingCustomImage(this,"123123123");
4、警告toast
 T.showWrongCustomImage(this,"123123123");

 其他具备能力：

说明：开发具体UI说明链接地址
https://confluence.olafuwu.com/pages/viewpage.action?pageId=19019340

```