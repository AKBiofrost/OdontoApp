package com.example.proto_hd_odontologia;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;

public class splash_information extends AppCompatActivity {

    private Animation topAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_information);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                startActivity(new Intent(splash_information.this, InicioUsuario.class));
                overridePendingTransition(R.transition.fade_in, R.transition.left_out);
                finish();
            }
        },3000);




    }



    @Override
    protected void onPause(){

        super.onPause();
        finish();
    }


}
