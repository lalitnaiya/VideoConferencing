package com.twilio.video.app.data.api

import com.google.gson.annotations.SerializedName

//data class AuthServiceResponseDTO(
//        val token: String? = null,
////        @SerializedName("room_type") val topology: Topology? = null
//)


data class AuthServiceResponseDTO(
        @SerializedName("Token") val roomDetails: String
)

