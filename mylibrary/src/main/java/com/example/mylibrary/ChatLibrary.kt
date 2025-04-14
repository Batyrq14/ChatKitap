package com.example.mylibrary

import android.content.Context
import android.content.Intent
import com.example.mylibrary.ChatActivity

class ChatLibrary private constructor() {

    companion object {
        /**
         * Starts the chat activity
         * @param context The context to start the activity from
         */
        @JvmStatic
        fun start(context: Context) {
            val intent = Intent(context, ChatActivity::class.java)
            context.startActivity(intent)
        }
    }
}