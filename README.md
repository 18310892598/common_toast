背景：Android乘客端和司机端需要做UI统一

概述具备能力：支持提示成功、失败、警告和加载四种通用UI，为了两端的通用功能，支持司机端现在封装的所有toast
方法，司机端需要增加类型
toastType 0:默认之前司机端样式，1：失败提示 2：表示成功 3：加载中 4：警告 5：无图自定义样式

1梳理司机端目前使用的方法
/**
     * 短时间显示Toast str
     *
     * @param context
     * @param message
     * @param toastType 0:toast原生样式，1：自定义失败提示 2：自定义成功样式 3：自定义加载中样式 4：自定义警告 5：自定义无图自定义样式
     */
    public static void showShort(Context context, CharSequence message,int toastType)


2、/**
       * 短时间显示Toast int
       *
       * @param context
       * @param message
       * @param toastType 0:toast原生样式，1：自定义失败提示 2：自定义成功样式 3：自定义加载中样式 4：自定义警告 5：自定义无图自定义样式
       */
      public static void showShort(Context context, int message,int toastType)

3、 /**
       * 长时间显示Toast str
       *
       * @param context
       * @param message
       * @param toastType 0:toast原生样式，1：自定义失败提示 2：自定义成功样式 3：自定义加载中样式 4：自定义警告 5：自定义无图自定义样式
       */
      public static void showLong(Context context, CharSequence message,int toastType)

4、/**
       * 长时间显示Toast int
       *
       * @param context
       * @param message
       * @param toastType 0:toast原生样式，1：自定义失败提示 2：自定义成功样式 3：自定义加载中样式 4：自定义警告 5：自定义无图自定义样式
       */
      public static void showLong(Context context, int message,int toastType)

5、 /**
       * 自定义显示Toast时间 str
       *
       * @param context
       * @param message
       * @param duration
       * @param toastType 0:toast原生样式，1：自定义失败提示 2：自定义成功样式 3：自定义加载中样式 4：自定义警告 5：自定义无图自定义样式
       */
      public static void showCustom(Context context, CharSequence message, int duration,int toastType)
6、 /**
       * 自定义显示Toast时间 int
       *
       * @param context
       * @param message
       * @param duration
       * @param toastType 0:toast原生样式，1：自定义失败提示 2：自定义成功样式 3：自定义加载中样式 4：自定义警告 5：自定义无图自定义样式
       */
      public static void showCustom(Context context, int message, int duration,int toastType)

7、/**
       * 默认str显示Toast int
       *
       * @param context
       * @param message
       * @param toastType 0:toast原生样式，1：自定义失败提示 2：自定义成功样式 3：自定义加载中样式 4：自定义警告 5：自定义无图自定义样式
       */
      public static void show(Context context, int message,int toastType)

8、/**
       * 默认str显示Toast String
       *
       * @param context
       * @param message
       * @param toastType 0:toast原生样式，1：自定义失败提示 2：自定义成功样式 3：自定义加载中样式 4：自定义警告 5：自定义无图自定义样式
       */
      public static void show(Context context, String message,int toastType)



```java
第一步骤
//添加依赖
api 'com.ole.libtoast:toast:1.0.4'

说明:1、最新版本1.3解决了toast所依赖的上下文出现被销毁或者回收的时候调用toast
引发的crash
2、增加了参数，具体如上（梳理司机端目前使用的方法）


 
```
```java
第二步骤

   /**
     * 自定义成功弹出toast，参数如下说明
     * @param context 当前依赖上下文
     * @param   title 显示的内容             
     * @param  toastType :0 默认为 LENGTH_SHORT  1：则表示LENGTH_LONG
     */

------------------------------------------------
举例：show方法，其他方法参考上面

1、失败弹出toast
 OlaToast.show(this,"123123123",0);
2、成功toast提示
 OlaToast.show(this,"123123123",0);
3、加载中toast
 OlaToast.show(this,"123123123",0);
4、警告toast
 OlaToast.show(this,"123123123",0);
5、通用没有图片的toast展示
 OlaToast.show(this,"1123132",0);


样式说明：开发具体UI说明链接地址
https://confluence.olafuwu.com/pages/viewpage.action?pageId=19019340

、样式已经经过验证

```