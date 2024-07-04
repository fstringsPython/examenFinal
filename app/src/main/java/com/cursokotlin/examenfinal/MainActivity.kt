package com.cursokotlin.examenfinal

import android.app.Activity
import android.icu.number.IntegerWidth
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.annotation.IntegerRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.cursokotlin.examenfinal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewB: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        viewB = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewB.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        viewB.button1.setOnClickListener {calcular()}



    }

    fun calcular() {
        //variables
        val num1 = viewB.edit1.text.toString().toInt()
        val num2 = viewB.edit2.text.toString().toInt()
        //condicional suma
        if (viewB.suma.isChecked==true) {
            val resultado = num1 + num2
            viewB.textV1.setText(resultado.toString())
            //condicional resta
        }
        if (viewB.resta.isChecked==true) {
            val resultado = num1 - num2
            viewB.textV1.setText(resultado.toString())
        }// condicional multiplicacion
        if (viewB.multiplicacion.isChecked==true) {
            val resultado = num1 * num2
            viewB.textV1.setText(resultado.toString())
        }// condicional division
        if (viewB.division.isChecked==true) {
            val resultado = num1 / num2
            viewB.textV1.setText(resultado.toString())
        }
    }
}