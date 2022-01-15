package com.example.challengebcp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.core.content.ContextCompat
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MenuActivity : AppCompatActivity() {
    private lateinit var tiSendTextInputLayout: TextInputLayout
    private lateinit var sendEditText: TextInputEditText
    override fun onStart() {
        val normalColorStateList = ContextCompat.getColorStateList(this, R.color.your_custom_grey)
        tiSendTextInputLayout.setStartIconTintList(normalColorStateList)
        super.onStart()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        tiSendTextInputLayout = findViewById(R.id.til_firstTextInputLayout)
        sendEditText = findViewById(R.id.sendEditText)

        sendEditText.setOnFocusChangeListener { v, hasFocus ->
            when {
                !hasFocus -> {
                    val normalColorStateList = ContextCompat.getColorStateList(applicationContext, R.color.your_custom_grey)
                    tiSendTextInputLayout.setStartIconTintList(normalColorStateList)
                }
                else -> {
                    val normalColorStateList =
                        ContextCompat.getColorStateList(applicationContext, R.color.blue)
                    tiSendTextInputLayout.setStartIconTintList(normalColorStateList)
                }
            }
        }
    }


}