package com.example.navdemov2

import java.time.LocalDateTime

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class User (

    val name:String,
    val id:String,
    val created:LocalDateTime

    ):Parcelable
{

}



