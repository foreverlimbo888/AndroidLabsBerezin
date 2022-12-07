package com.example.lab5berezinandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.lab5berezinandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var numOfClick = 0

        var changeButtons = false

        binding.textView.text="Счётчик: $numOfClick"

        binding.button1.setOnClickListener()
        {
            if (!changeButtons) {
                numOfClick++
                binding.textView.text = "Счётчик: $numOfClick"
            }else{
                numOfClick+=10
                binding.textView.text = "Счётчик: $numOfClick"
            }
        }



        binding.button2.setOnLongClickListener(){
            if (!changeButtons) {
                numOfClick += 2
                binding.textView.text = "Счётчик: $numOfClick"
            }else{
                numOfClick = 0
                binding.textView.text = "Счётчик: $numOfClick"
            }

            true
        }


        binding.checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){

                changeButtons = true

                binding.button1.text = "Нажмите [+10]"
                binding.button2.text = "Зажмите [Обнулить]"




            }else{

                changeButtons = false

                binding.button1.text = "Нажмите [+1]"
                binding.button2.text = "Зажмите [+2]"

            }
            true
        }

    }
}