package com.macalester.DailyFeast;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by fabiolagutierrez on 5/7/14.
 */
//Source: http://www.androidhive.info/2013/07/how-to-implement-android-splash-screen-2/
public class SplashScreenActivity extends Activity {
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            //Show splash screen with timer
            @Override
            public void run() {
                // Starts StartUpActivity once timer is over
                Intent i = new Intent(SplashScreenActivity.this, StartUpActivity.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}