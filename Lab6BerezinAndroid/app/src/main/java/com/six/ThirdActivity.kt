package com.six

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.six.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button3.setOnClickListener {
            val intentUserData = intent.getParcelableExtra<UserData>("userData")

            intentUserData?.let {
                binding.textView.text = "${it.name}, ${it.age}, ${it.isDriver}"
            }
        }

        binding.button4.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.apply {
            putString("userData", binding.textView.text.toString())
        }

        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        savedInstanceState.run {
            binding.textView.text = getString("userData")
        }
    }
}