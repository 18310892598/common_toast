package com.ole.common_toast;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ole.libtoast.OlaToast;

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
                try {
                    OlaToast.show(this,"hello world1",1);

                }catch (Exception e){
                    e.printStackTrace();
                }
                break;
            case R.id.one1:
                OlaToast.show(this,"hello world11",2);
                break;
            case R.id.one2:
                OlaToast.show(this,"hello world2",3);
                break;
            case R.id.one3:
                OlaToast.show(this,"hello world3",4);
                break;
            case R.id.one4:
                OlaToast.show(this,"hello world4",5);
                break;
            case R.id.one5:
                OlaToast.show(this,"hello world5",0);
                break;
        }
    }
}
