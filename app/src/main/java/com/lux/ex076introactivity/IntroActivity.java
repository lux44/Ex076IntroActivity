package com.lux.ex076introactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class IntroActivity extends AppCompatActivity {

    ImageView iv;
    TextView tv;
    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        iv=findViewById(R.id.iv);
        //애니메이션 객체 생성 - xml에 정의한 애니메이션 설정값을 기반으로
        animation= AnimationUtils.loadAnimation(this,R.anim.appear_logo);
        iv.startAnimation(animation);

        //애니메이션의 동작에 대한 리스너
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent=new Intent(IntroActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });


        tv=findViewById(R.id.tv);
        Animation ani2=AnimationUtils.loadAnimation(this,R.anim.appear_title);
        tv.startAnimation(ani2);
    }
}