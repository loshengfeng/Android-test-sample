package com.arvin.studio.android_test_sample

class Mother {
    fun inform(money: Int) {
        println("媽媽我現在有 $money 元，我要跟你拿錢！")
    }

    fun giveMoney(): Int {
        return 100
    }

    fun giveMsgArvin(): String {
        return "Arvin"
    }

    fun giveTrueArvin(): Boolean {
        return true
    }
}