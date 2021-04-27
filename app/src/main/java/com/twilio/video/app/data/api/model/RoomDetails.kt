package com.twilio.video.app.data.api.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class RoomDetails(
        @SerializedName("Token") val token : String
):Serializable

