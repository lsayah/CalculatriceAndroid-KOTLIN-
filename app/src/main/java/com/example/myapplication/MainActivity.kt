package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var ValeurA:EditText
    lateinit var ValeurB:EditText
    lateinit var Résultats:TextView
    lateinit var Calculer:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

           this.ValeurA=findViewById(R.id.ValeurA)
            this.ValeurB=findViewById(R.id.ValeurB)
            this.Calculer=findViewById(R.id.Calculer)


            Calculer.setOnClickListener {
                val valueA = ValeurA.text.toString()
                val valueB = ValeurB.text.toString()

                if (valueA.isNotEmpty() && valueB.isNotEmpty()) {

                    val numA = valueA.toDouble()
                    val numB = valueB.toDouble()

                    val result = numA + numB
                    Résultats.setText("Résultat : $result")
                } else {
                    Résultats.setText("Veuillez entrer des valeurs !")
                }
            }
        }
    }
