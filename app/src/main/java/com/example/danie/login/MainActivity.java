package com.example.danie.login;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        LinearLayout linearLogin = findViewById(R.id.Linear_Login);
        Bitmap originalBitmap = BitmapFactory.decodeResource(getResources(),R.drawable.background_image);
        Bitmap blurred = BlurBuilder.blur(this,originalBitmap);
        linearLogin.setBackground(new BitmapDrawable(getResources(), blurred));
    }
}
