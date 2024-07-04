package com.cursokotlin.examenfinal

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
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

        viewB.button1.setOnClickListener { calcular() }



    }

    fun calcular() {
        //variables
        val num1 = viewB.edit1.text.toString().toInt()
        val num2 = viewB.edit2.text.toString().toInt()
        //condicional suma
        if (viewB.suma.isSelected) {
            val resultado = num1 + num2
            viewB.textV1.setText(resultado.toString())
            //condicional resta
        }
        if (viewB.resta.isSelected) {
            val resultado = num1 - num2
            viewB.textV1.setText(resultado.toString())
        }// condicional multiplicacion
        if (viewB.multiplicacion.isSelected) {
            val resultado = num1 * num2
            viewB.textV1.setText(resultado.toString())
        }// condicional division
        if (viewB.division.isSelected) {
            val resultado = num1 / num2
            viewB.textV1.setText(resultado.toString())
        }
    }
}