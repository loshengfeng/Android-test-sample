package com.arvin.studio.android_test_sample

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel : ViewModel() {

    val isIntent: MutableLiveData<Boolean> = MutableLiveData()
    val result: MutableLiveData<String> = MutableLiveData()

    val service by lazy {
        RetrofitComponent.create()
    }

    init {
        searchUser()
    }


    fun changeBoolean() {
        isIntent.postValue(true)
    }

    fun total() {
        result.postValue("2")
    }

    fun searchUser() {
        service.getUser("defunkt").enqueue(object : Callback<UserInfo> {

            override fun onFailure(call: Call<UserInfo>, t: Throwable) {
                Log.d("MY_APP", "fail")
            }

            override fun onResponse(call: Call<UserInfo>, response: Response<UserInfo>) {
                Log.d("MY_APP", "success")
            }
        })

    }
}