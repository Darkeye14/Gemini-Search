package com.example.geminisearch

import android.graphics.Bitmap
import com.example.geminisearch.Data.Chat

data class ChatState (
   val chatList : MutableList<Chat> = mutableListOf(),
   val prompt : String = "",
    val bitmap: Bitmap? = null
)