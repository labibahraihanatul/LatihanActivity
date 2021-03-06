package com.labibah.barvolume

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var edtWidth: EditText
    private lateinit var edtHeigth: EditText
    private lateinit var edtLength: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtWidth = findViewById(R.id.edt_width)
        edtHeigth = findViewById(R.id.edt_height)
        edtLength = findViewById(R.id.edt_length)
        btnCalculate = findViewById(R.id.btn_calculate)
        tvResult = findViewById(R.id.tv_result)

        btnCalculate.setOnClickListener(this)
    }

    poverride fun onClick(v: View) {
        if (v.id == R.id.btn_calculate) {
            val inputLength = edtLength.text.toString().trim()
            val inputWidth = edtWidth.text.toString().trim()
            val inputHeigth = edtHeigth.text.toString().trim()

            var isEmpty()) {
                isEmptyFields = true
                edtLength.error = "Field ini tidak boleh kosong"
            }
            if (inputLength.isEmpty()) {
                isEmptyFields = true
                edtLength.error ="Field ini tidak boleh kosong"
            }
            if (inputWidth.isEmpty()) {
                isEmptyFields = true
                edtWidth.error = "Field ini tidak boleh kosong"
            }
            if (inputHeigth.isEmpty()) {
                isEmptyField = true
                edtHeigth.error = "Field ini tidak boleh kosong"
            }
            if (!isEmptyFields) {
                val volume = inputLength.toDouble() * inputWidth.toDouble() * inputHeigth.toDouble()
            }
        }
    }
}
