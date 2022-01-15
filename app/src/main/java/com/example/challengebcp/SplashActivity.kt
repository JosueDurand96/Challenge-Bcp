package com.example.challengebcp

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.MotionEvent
import android.view.View
import android.widget.TextView
import android.util.Log


class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val durationSplash = 2800
        Handler().postDelayed({
            setupWindowAnimations()
        }, durationSplash.toLong())

    }
    private fun setupWindowAnimations() {
        val i = Intent(this, MenuActivity::class.java)
        val transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation(this)
        startActivity(i, transitionActivityOptions.toBundle())

    }
}