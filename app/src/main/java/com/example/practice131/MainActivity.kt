package com.example.practice131


import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import android.view.View
import kotlin.math.sqrt
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val editTextNumber = findViewById<EditText>(R.id.editTextNumber)
        val editTextNumber2 = findViewById<EditText>(R.id.editTextNumber2)
        val textView=findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val editTextNumber=editTextNumber.text.toString().toDouble()
            val editTextNumber2=editTextNumber2.text.toString().toDouble()
            val hupotenuse=sqrt(editTextNumber * editTextNumber2) + (editTextNumber2 * editTextNumber2)
            val perimetr=editTextNumber+editTextNumber2*hupotenuse
            val area=0.5*editTextNumber*editTextNumber2
            val textView = "Гипотенуза треугольника: $hupotenuse\n" +
                    "Периметр треугольника: $perimetr\n" +"Площадь треугольника: $area"


        }
    }
}
