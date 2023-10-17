package com.example.a17okt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a17okt.databinding.ActivityHeroBinding

class hero : AppCompatActivity() {
    private lateinit var binding: ActivityHeroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHeroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val user = intent.getStringExtra("username")

        with(binding){
            getusername.text = user
        }
    }
}