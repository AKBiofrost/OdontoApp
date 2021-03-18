package com.example.proto_hd_odontologia

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var topAnim: Animation? = null
    private var bottomAnim: Animation? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_welcome)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.splash_welcome)


        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.botton_animation)

        val logo = findViewById<View>(R.id.LogotipoApp)
        val slogan = findViewById<View>(R.id.NombreApp)

        logo.animation = topAnim
        slogan.animation = bottomAnim



        Handler().postDelayed({
            startActivity(Intent(this@MainActivity, splash_information::class.java))
            overridePendingTransition(R.transition.fade_in, R.transition.left_out)
            finish()
        }, 3000)


    }


    override fun onPause() {
        super.onPause()
        finish()

    }






}
