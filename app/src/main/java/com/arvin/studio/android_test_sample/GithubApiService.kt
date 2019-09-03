package com.arvin.studio.android_test_sample

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubApiService {
    @GET("/users/{name}")
    fun getUser(@Path("name") name: String): Call<UserInfo>
}