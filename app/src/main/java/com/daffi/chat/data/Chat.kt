package com.daffi.chat.data

import android.graphics.Bitmap


/*
Contiene los componentes que lleva el chat
 */
data class Chat (
    val prompt: String,
    val bitmap: Bitmap?,
    val isFromUser: Boolean
)
