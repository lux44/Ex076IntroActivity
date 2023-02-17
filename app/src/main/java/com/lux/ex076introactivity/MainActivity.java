package com.lux.ex076introactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //4초 후에 자동으로 다음 액티비티로 이동하기
        handler.sendEmptyMessageDelayed(0,4000);
    }

    Handler handler=new Handler(Looper.getMainLooper()){
        @Override
        public void handleMessage(@NonNull Message msg) {
            Intent intent=new Intent(MainActivity.this,SecondActivity.class);
            startActivity(intent);
            finish();
        }
    };

}