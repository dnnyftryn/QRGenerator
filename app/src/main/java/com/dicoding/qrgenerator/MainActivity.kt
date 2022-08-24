package com.dicoding.qrgenerator

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import com.google.zxing.BarcodeFormat
import com.journeyapps.barcodescanner.BarcodeEncoder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        val editText = findViewById<EditText>(R.id.idEdt)
        val text = "https://www.google.com"

//        val editText : EditText = findViewById(R.id.idEdt)

        val btn = findViewById<Button>(R.id.idBtnGenerateQR)

        btn.setOnClickListener {
            val encoder = BarcodeEncoder()
            val bitmap = encoder.encodeBitmap(text.toString(), BarcodeFormat.QR_CODE, 400, 400)
            val myImageView = findViewById<ImageView>(R.id.idIVQrcode)
            myImageView.setImageBitmap(bitmap)
        }
    }
}