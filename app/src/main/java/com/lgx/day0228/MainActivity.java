package com.lgx.day0228;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.lang.ref.WeakReference;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		int a = 3;
		int b = 4;

        Handler handler = new Handler(){
            @Override
            public void handleMessage(@NonNull Message msg) {
                super.handleMessage(msg);
            }
        };
        MyHandler myHandler = new MyHandler(this);


        WebView webView = new WebView(this);
        ViewParent parent = webView.getParent();
        

    }


     public static class MyHandler extends Handler{

        private WeakReference<Activity> weakReference;

        public MyHandler(Activity activity){
            weakReference = new WeakReference<Activity>(activity);
        }
         @Override
         public void handleMessage(@NonNull Message msg) {
             super.handleMessage(msg);
             Activity activity = weakReference.get();
             if (activity != null){

             }
         }
     }

     
}
