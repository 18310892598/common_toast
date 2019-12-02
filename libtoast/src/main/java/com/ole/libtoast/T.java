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

/**
 * @desc android 乘客端和司机端toast的封装
 * 支持四种种自定义样式（成功、失败、加载中、警告）
 */
public class T {



    /**
     * 自定义失败弹出toast
     * @param context
     */
    public static void showFailCustomImage(Context context,String title) {
        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.layout_custom_toast, null, false);
        AppCompatImageView img = view.findViewById(R.id.img);
        TextView tvc=view.findViewById(R.id.tv_toast_title);
        tvc.setText(title);
        img.setImageResource(R.mipmap.toast_icon_wrong);
        toast.setView(view);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    /**
     * 自定义成功弹出toast
     * @param context
     */
    public static void showSuccessCustomImage(Context context,  String title) {
        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.layout_custom_toast, null, false);
        AppCompatImageView img = view.findViewById(R.id.img);
        TextView tvc=view.findViewById(R.id.tv_toast_title);
        tvc.setText(title);
        img.setImageResource(R.mipmap.toast_icon_succeed);
        toast.setView(view);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    /**
     * 自定义加载弹出toast
     * @param context
     */
    public static void showloadingCustomImage(Context context, String title) {
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
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }


    /**
     * 自定义警告弹出toast
     * @param context
     */
    public static void showWrongCustomImage(Context context,  String title) {
        Toast toast = new Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.layout_custom_toast, null, false);
        AppCompatImageView img = view.findViewById(R.id.img);
        TextView tvc=view.findViewById(R.id.tv_toast_title);
        tvc.setText(title);
        img.setImageResource(R.mipmap.toast_icon_hint);
        toast.setView(view);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

}
