package com.daffi.chat

import android.graphics.Bitmap
import com.daffi.chat.data.Chat

data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)