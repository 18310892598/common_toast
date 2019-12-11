package com.ole.libtoast;


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
 * @author huyixiang
 * @desc android 乘客端和司机端toast的封装
 * 支持五种种自定义样式（成功、失败、加载中、警告、普通文字模式）
 */
public class ToastView {



    /**
     * 自定义失败弹出toast
     * @param context
     * @param  toastType :0 默认为 LENGTH_SHORT  1：则表示LENGTH_LONG
     */
    public  static Toast showFailCustomImage(Context context,CharSequence title,int toastType) {
        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.layout_custom_toast, null, false);
        AppCompatImageView img = view.findViewById(R.id.img);
        TextView tvc=view.findViewById(R.id.tv_toast_title);
        tvc.setText(title);
        img.setImageResource(R.mipmap.toast_icon_wrong);
        toast.setView(view);
        toast.setDuration(toastType);
        toast.setGravity(Gravity.CENTER, 0, 0);
        return toast;
    }

    /**
     * 自定义成功弹出toast，参数如下说明
     * @param context 当前依赖上下文
     * @param   title 显示的内容
     * @param  toastType :0 默认为 LENGTH_SHORT  1：则表示LENGTH_LONG
     */
    public static Toast showSuccessCustomImage(Context context,  CharSequence title,int toastType) {
        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.layout_custom_toast, null, false);
        AppCompatImageView img = view.findViewById(R.id.img);
        TextView tvc=view.findViewById(R.id.tv_toast_title);
        tvc.setText(title);
        img.setImageResource(R.mipmap.toast_icon_succeed);
        toast.setView(view);
        toast.setDuration(toastType);
        toast.setGravity(Gravity.CENTER, 0, 0);
        return toast;
    }

    /**
     * 自定义加载弹出toast
     * @param context
     * @param  toastType :0 默认为 LENGTH_SHORT  1：则表示LENGTH_LONG
     */
    public static Toast showloadingCustomImage(Context context, CharSequence title,int toastType) {
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
        toast.setDuration(toastType);
        toast.setGravity(Gravity.CENTER, 0, 0);
        return toast;
    }


    /**
     * 自定义警告弹出toast
     * @param context
     * @param  toastType :0 默认为 LENGTH_SHORT  1：则表示LENGTH_LONG
     */
    public static Toast showWrongCustomImage(Context context,  CharSequence title,int toastType) {

        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.layout_custom_toast, null, false);
        AppCompatImageView img = view.findViewById(R.id.img);
        TextView tvc=view.findViewById(R.id.tv_toast_title);
        tvc.setText(title);
        img.setImageResource(R.mipmap.toast_icon_hint);
        toast.setView(view);
        toast.setDuration(toastType);
        toast.setGravity(Gravity.CENTER, 0, 0);
        return  toast;
    }


    /**
     * @如果是没有图片，默认此种方法
     * @param context
     * @param content
     * @param  toastType :0 默认为 LENGTH_SHORT  1：则表示LENGTH_LONG
     */
    public static Toast showCustomView(Context context, CharSequence content,int toastType) {
        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.layout_custom_toast_view, null, false);
        AppCompatTextView contentText = view.findViewById(R.id.content);
        contentText.setText(content);
        toast.setView(view);
        toast.setDuration(toastType);
        toast.setGravity(Gravity.CENTER, 0, 0);
        return toast;

    }

}
