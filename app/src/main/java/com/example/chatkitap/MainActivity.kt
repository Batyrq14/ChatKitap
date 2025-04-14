package com.example.chatkitap

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.chatkitap.databinding.ActivityMainBinding
import com.example.mylibrary.ChatLibrary
import android.content.Context
import android.content.Intent

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startChatButton.setOnClickListener {
            ChatLibrary.start(this)
        }
    }
}