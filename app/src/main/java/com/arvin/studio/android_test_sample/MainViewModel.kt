package com.arvin.studio.android_test_sample

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val isIntent: MutableLiveData<Boolean> = MutableLiveData()
    val result: MutableLiveData<String> = MutableLiveData()

    fun changeBoolean() {
        isIntent.postValue(true)
    }

    fun total() {
        result.postValue("2")
    }
}