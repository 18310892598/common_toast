package com.ole.common_toast;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ole.libtoast.T;

/**
 * @desc webview 启动页
 * @author hyx
 */
public class MainActivity extends Activity implements View.OnClickListener{


    private Button one,one1,one2,one3,one4,one5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one=findViewById(R.id.one);
        one.setOnClickListener(this);
        one1=findViewById(R.id.one1);
        one2=findViewById(R.id.one2);
        one3=findViewById(R.id.one3);
        one4=findViewById(R.id.one4);
        one5=findViewById(R.id.one5);
        one1.setOnClickListener(this);
        one2.setOnClickListener(this);
        one3.setOnClickListener(this);
        one4.setOnClickListener(this);
        one5.setOnClickListener(this);

          }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.one:
                T.showFailCustomImage(this,"123123123",0);
                break;
            case R.id.one1:
                T.showSuccessCustomImage(this,"123123123",0);
                break;
            case R.id.one2:
                T.showloadingCustomImage(this,"123123123",0);
                break;
            case R.id.one3:
                T.showWrongCustomImage(this,"123123123",0);
                break;
            case R.id.one4:
                T.showCustomView(this,"123123123",0);
                break;
            case R.id.one5:
                T.showWrongCustomImage(this,"欢迎来到我的大世界\n一起疯狂",0);
                break;
        }
    }
}
