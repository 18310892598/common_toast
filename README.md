概述具备能力：
1. 抽取公用webview能力，通用title配置，支持一级页面返回，二级页面关闭及分享控制
2. 初始化webview公用属性设置
3. 支持分享按钮自定义背景图片及点击事件
4. 支持通用useragent配置，参考FE规范
5. 抛出关闭当前Activity业务回调接口，处理业务
6. 绑定JS业务，业务回调下沉到端内自己处理
7. 支持网页控制返回功能是否关闭当前Activity


```java
第一步骤
//根目录build.gradle添加
allprojects {
    repositories {
        maven {
            //
            url 'https://nexus.olafuwu.com/repository/maven-oleyc-android-releases/'
            credentials {
                username rootProject.ext.maven["username"]
                password rootProject.ext.maven["userpassword"]
            }
        }
    }
}
 
```
```java
第二步骤 配置权限
 配置权限
<uses-permission android:name="android.permission.INTERNET"/>
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
<uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
<uses-permission android:name="android.permission.ACCESS_LOCATION_EXTRA_COMMANDS" />


第三步骤：配置依赖库
api 'com.ole.libwebview:webview:1.0.6'

第四步骤：业务布局中引入自定义控件
<com.ole.libwebview.BaseWebview
        android:id="@+id/common_toastview"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>
        
第五步骤：使用配置接口实现，绑定业务js回调业务处理
 /**
     * 接口回调
     */
    BaseWebview.webviewListen webListen = new BaseWebview.webviewListen() {
        @Override
        public void webviewFinish() {
            finish();
        }

        @Override
        public void rightButtonOnClick() {
            //处理分享对应业务逻辑
        }
    };
    
    //自定义控件baseWeb，设置回调结果处理
    baseWeb.setWebviewListen(webListen);
    
    baseWeb.mWebView.addJavascriptInterface(new WebViewInterface(LocalWebActivity.this),
                "android");
    baseWeb.mWebView.addJavascriptInterface(new WebViewInterface(LocalWebActivity.this),
                "commonBridge");
    // 说明LocalWebActivity 内部类，接口业务回调业务，名称根据各自端内名称不同灵活修改
    baseWeb.webvewLoadUrl("xxxxxxx");

    第六步骤：
    页面销毁的时候，一定在当前destory方法中调用
    baseWeb.onDestroy();
    
 其他具备能力：
 1、支持自定义网页title 使用方法 baseWeb.setTitle("xxxxx");
 2、支持右按钮自定义图片，及点击事件 xx资源图片id，xxx 布尔类型，true表示显示，false隐藏
    baseWeb.setButtonBackgroundImg(xx,xxx);
 3、useragent 已经统一处理，外部不需要处理
 
```