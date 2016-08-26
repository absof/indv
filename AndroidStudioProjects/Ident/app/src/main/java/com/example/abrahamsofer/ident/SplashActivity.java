package com.example.abrahamsofer.ident;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import java.util.concurrent.TimeUnit;

/**
 * Created by abrahamsofer on 10/08/2016.
 */
public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)  {


        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e ) {

        }


        Intent intent = new Intent(this, CameraActivity.class);
        startActivity(intent);
        finish();
    }
}
