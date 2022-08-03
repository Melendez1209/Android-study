package com.example.attributeanimation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find by id
        TextView textView = findViewById(R.id.tv);

        //Value Animator
        //创建属性动画
        ValueAnimator valueAnimator = ValueAnimator.ofFloat(0f, 1f);
        valueAnimator.setDuration(1500);//动画时长（毫秒）
        //实时更新
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animator) {
                float value = (float) animator.getAnimatedValue();
                Log.w("Melendez", "onAnimationUpdate: " + value);
            }
        });
        //启动动画
        valueAnimator.start();


        //ObjectAnimator
        //创建属性动画
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(textView, "alpha", 0f, 1f);
        objectAnimator.setDuration(1500);//动画时长（毫秒）
        //启动动画
        objectAnimator.start();

        //监听器
        objectAnimator.addListener(new Animator.AnimatorListener() {
            //动画开始时执行的函数
            @Override
            public void onAnimationStart(Animator animator) {

            }

            //动画结束时执行的函数
            @Override
            public void onAnimationEnd(Animator animator) {

            }

            //动画取消时执行的函数
            @Override
            public void onAnimationCancel(Animator animator) {

            }

            //动画重复时执行的函数
            @Override
            public void onAnimationRepeat(Animator animator) {

            }

            //以上四个单写一个调用也可
        });
    }

}