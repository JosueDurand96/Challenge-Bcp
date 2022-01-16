package com.example.challengebcp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MenuActivity : AppCompatActivity() {

    private lateinit var sendEditText: TextInputEditText
    private lateinit var getEditText: TextInputEditText
    //TextView
    private lateinit var purchaseTextView: TextView
    private lateinit var saleTextView: TextView
    private lateinit var firstCoinTextView:TextView
    private lateinit var secondCoinTextView:TextView


    private lateinit var changeImageView:ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        sendEditText = findViewById(R.id.sendEditText)
        getEditText = findViewById(R.id.getEditText)

        changeImageView = findViewById(R.id.changeImageView)
        firstCoinTextView = findViewById(R.id.firstCoinTextView)
        secondCoinTextView = findViewById(R.id.secondCoinTextView)

        changeImageView.setOnClickListener {
            sendEditText.setText("")
            getEditText.setText("")
            val firstCoinValue = firstCoinTextView.text.toString()
            val secondCoinValue = secondCoinTextView.text.toString()
            if (firstCoinValue == "Dólares"){
                firstCoinTextView.text = secondCoinValue
                secondCoinTextView.text = firstCoinValue
            }else if (firstCoinValue == "Soles"){
                firstCoinTextView.text = secondCoinValue
                secondCoinTextView.text = firstCoinValue
            }
        }
    }




}