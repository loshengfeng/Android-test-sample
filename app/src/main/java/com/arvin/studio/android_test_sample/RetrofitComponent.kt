package com.arvin.studio.android_test_sample

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitComponent {
    companion object {
        fun create(): GithubApiService {
            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.github.com")
                .build()

            return retrofit.create(GithubApiService::class.java)
        }
    }
}