//AULA - 001

//package com.example.primeiroapp

//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//import com.example.primeiroapp.databinding.ActivityMainBinding

//class MainActivity : AppCompatActivity() {

    //private lateinit var binding: ActivityMainBinding

    //override fun onCreate(savedInstanceState: Bundle?) {
        //super.onCreate(savedInstanceState)
        //binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(binding.root)

        //binding.buttonHello.setOnClickListener {
            //val name = binding.inputName.text.toString()

            //binding.textResult.text = "Olá, " + name
            //binding.textResult.text = "Olá, ${name}"
            //binding.textResult.setText("Olá, " + name)

        //}

    //}
//}

//*-------------------------------------------------------------------------------------------------------*

//AULA - 002

package com.example.primeiroapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.primeiroapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }
}