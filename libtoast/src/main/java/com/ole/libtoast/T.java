package com.ole.libtoast;


import android.app.Activity;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

/**
 * @desc android 乘客端和司机端toast的封装
 * 支持四种种自定义样式（成功、失败、加载中、警告）
 */
public class T {



    /**
     * 自定义失败弹出toast
     * @param context
     * @param  toastType :0 默认为 LENGTH_SHORT  1：则表示LENGTH_LONG
     */
    public static void showFailCustomImage(Context context,String title,int toastType) {
        if (context instanceof Activity && ((Activity) context).isFinishing()) {
            return;
        }
        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.layout_custom_toast, null, false);
        AppCompatImageView img = view.findViewById(R.id.img);
        TextView tvc=view.findViewById(R.id.tv_toast_title);
        tvc.setText(title);
        img.setImageResource(R.mipmap.toast_icon_wrong);
        toast.setView(view);
        if(toastType==0) {
            toast.setDuration(Toast.LENGTH_SHORT);
        }else{
            toast.setDuration(Toast.LENGTH_LONG);
        }
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    /**
     * 自定义成功弹出toast，参数如下说明
     * @param context 当前依赖上下文
     * @param   title 显示的内容
     * @param  toastType :0 默认为 LENGTH_SHORT  1：则表示LENGTH_LONG
     */
    public static void showSuccessCustomImage(Context context,  String title,int toastType) {
        if (context instanceof Activity && ((Activity) context).isFinishing()) {
            return;
        }
        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.layout_custom_toast, null, false);
        AppCompatImageView img = view.findViewById(R.id.img);
        TextView tvc=view.findViewById(R.id.tv_toast_title);
        tvc.setText(title);
        img.setImageResource(R.mipmap.toast_icon_succeed);
        toast.setView(view);
        if(toastType==0) {
            toast.setDuration(Toast.LENGTH_SHORT);
        }else{
            toast.setDuration(Toast.LENGTH_LONG);
        }
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    /**
     * 自定义加载弹出toast
     * @param context
     * @param  toastType :0 默认为 LENGTH_SHORT  1：则表示LENGTH_LONG
     */
    public static void showloadingCustomImage(Context context, String title,int toastType) {
        if (context instanceof Activity && ((Activity) context).isFinishing()) {
            return;
        }
        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.layout_custom_toast, null, false);
        AppCompatImageView img = view.findViewById(R.id.img);
        TextView tvc=view.findViewById(R.id.tv_toast_title);
        tvc.setText(title);
        img.setImageResource(R.mipmap.toast_icon_loading);
        Animation animation = AnimationUtils.loadAnimation(context, R.anim.img_animation);
        //设置动画匀速运动
        LinearInterpolator lin = new LinearInterpolator();
        animation.setInterpolator(lin);
        img.startAnimation(animation);
        toast.setView(view);
        if(toastType==0) {
            toast.setDuration(Toast.LENGTH_SHORT);
        }else{
            toast.setDuration(Toast.LENGTH_LONG);
        }
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }


    /**
     * 自定义警告弹出toast
     * @param context
     * @param  toastType :0 默认为 LENGTH_SHORT  1：则表示LENGTH_LONG
     */
    public static void showWrongCustomImage(Context context,  String title,int toastType) {
        if (context instanceof Activity && ((Activity) context).isFinishing()) {
            return;
        }
        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.layout_custom_toast, null, false);
        AppCompatImageView img = view.findViewById(R.id.img);
        TextView tvc=view.findViewById(R.id.tv_toast_title);
        tvc.setText(title);
        img.setImageResource(R.mipmap.toast_icon_hint);
        toast.setView(view);
        if(toastType==0) {
            toast.setDuration(Toast.LENGTH_SHORT);
        }else{
            toast.setDuration(Toast.LENGTH_LONG);
        }
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }


    /**
     * @如果是没有图片，默认此种方法
     * @param context
     * @param content
     * @param  toastType :0 默认为 LENGTH_SHORT  1：则表示LENGTH_LONG
     */
    public static void showCustomView(Context context, String content,int toastType) {
        if (context instanceof Activity && ((Activity) context).isFinishing()) {
            return;
        }
        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.layout_custom_toast_view, null, false);
        AppCompatTextView contentText = view.findViewById(R.id.content);
        contentText.setText(content);
        toast.setView(view);
        if(toastType==0) {
            toast.setDuration(Toast.LENGTH_SHORT);
        }else{
            toast.setDuration(Toast.LENGTH_LONG);
        }
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();

    }

}
