package com.example.navdemov2



import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.time.LocalDateTime

data class MyUser(
    val name:String,
    val id:String,
    val created: LocalDateTime

): Parcelable