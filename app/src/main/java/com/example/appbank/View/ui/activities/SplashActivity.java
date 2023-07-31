package com.example.appbank.View.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

import com.example.appbank.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView arbol= findViewById(R.id.imageView2);

        Animation fadeIn= new AlphaAnimation(0,1);

        fadeIn.setDuration(2000);

        arbol.startAnimation(fadeIn);

        arbol.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent main= new Intent(SplashActivity.this, MainActivity.class);
                startActivity(main);
            }
        },10000);


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ImageView arbol= findViewById(R.id.imageView2);
        arbol.removeCallbacks(null);
    }
}