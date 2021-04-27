package com.twilio.video.app.data.api

import android.telecom.Call
import com.twilio.video.app.data.api.model.RoomDetails
import okhttp3.RequestBody
import retrofit2.http.*

const val URL_PREFIX = "https://video-app-"
const val URL_SUFFIX = "-dev.twil.io/token"

interface AuthService {

    @POST
    @FormUrlEncoded
    suspend fun getToken(
            @Url url: String,
            @Field("identity") email: String,
            @Field("roomName") password: String
    ): AuthServiceResponseDTO

}
