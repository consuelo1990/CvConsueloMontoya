package com.example.cvconsuelo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cvconsuelo.databinding.ActivityBackgroundBinding
import com.example.cvconsuelo.databinding.ActivityMainBinding

class BackgroundActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityBackgroundBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBackgroundBinding.inflate((layoutInflater))
        setContentView(binding.root);

        binding.cardFlecha.setOnClickListener {
            val intent = Intent ( this, MainActivity::class.java)
            startActivity((intent))
        }



    }

}