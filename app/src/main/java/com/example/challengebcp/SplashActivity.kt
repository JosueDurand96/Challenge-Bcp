package com.example.challengebcp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.MotionEvent
import android.view.View
import android.widget.TextView
import android.util.Log




class SplashActivity : AppCompatActivity() {
    private lateinit var textView:TextView
    private val cancelLongClick = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
        textView.setOnTouchListener { v, event ->
            when (event?.action) {
                MotionEvent.ACTION_DOWN -> {
                    Handler().postDelayed({
                        if (cancelLongClick==false) {
                            val intent = Intent(applicationContext, CoinActivity::class.java)
                            startActivity(intent)
                            Log.d("Josue", "SIIIII")
                        } else {
                            Log.d("Josue", "*Evento 2. Cancelado.")
                        }
                    }, 1500)

                }
            }

            v?.onTouchEvent(event) ?: true
        }
    }
}