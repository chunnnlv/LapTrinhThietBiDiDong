package com.example.baitapbuoi2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    private lateinit var edtEmail: EditText
    private lateinit var btnCheck: Button
    private lateinit var txtError: TextView

    private val correctEmail = "abc@gmail.com"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout2)

        edtEmail = findViewById(R.id.edtEmail)
        btnCheck = findViewById(R.id.btnCheck)
        txtError = findViewById(R.id.txtError)

        txtError.text = ""

        btnCheck.setOnClickListener {
            val email = edtEmail.text.toString().trim()

            if (email.isNullOrEmpty()) {
                txtError.text = "Email không hợp lệ"
                txtError.setTextColor(resources.getColor(android.R.color.holo_red_dark))
            } else if (!email.contains("@")) {
                txtError.text = "Email không đúng định dạng"
                txtError.setTextColor(resources.getColor(android.R.color.holo_red_dark))
            } else {
                txtError.text = "Bạn đã nhập email hợp lệ"
                txtError.setTextColor(resources.getColor(android.R.color.holo_green_dark))
            }
        }
    }
}
