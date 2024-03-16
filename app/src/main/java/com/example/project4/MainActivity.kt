package com.example.project4
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  //sets layout for this activity to activity_main.xml

        //declares variables num1, num2 and assigned to EditText from layout with IDs number1, number2
        val number1 = findViewById<EditText>(R.id.number1)
        val number2 = findViewById<EditText>(R.id.number2)
        //declares button and assigns to Button view from layout with ID compareButton
        val compareButton = findViewById<Button>(R.id.compareButton)
        //declares result
        val result = findViewById<TextView>(R.id.result)

        //gives click listener to compareButton.
        //after button clicked, code inside {} executes
        compareButton.setOnClickListener {   //button for user to click to see if num1 is < num2
            val num1 = number1.text.toString().toDouble()
            val num2 = number2.text.toString().toDouble()
            result.text = if (num1 < num2) "True" else "False"
        }
    }
}