package com.splash.project;


import com.code.project.IndexGridActivity;
import com.code.project.R;
import com.parse.Parse;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity{

	private static int SPLASH_TIME_OUT = 3000;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//setContentView();
		setContentView(R.layout.splashscreen);
		Parse.initialize(this, "UNWFs2et9ZfgLTcoadWQpReVhuF0WOs5MeMUfpS4", "8cBnwp7UbWIuuHvWwIlE4s9DEE8fE2pKw3TLXL6g");
		new Handler().postDelayed(new Runnable() { 
            @Override
            public void run() {              
                Intent i = new Intent(SplashScreen.this,IndexGridActivity.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);
	}
}
