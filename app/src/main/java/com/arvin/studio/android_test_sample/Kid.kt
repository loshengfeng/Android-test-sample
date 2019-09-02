package com.arvin.studio.android_test_sample

class Kid(private val mother: Mother) {
    var money = 0
        private set

    fun wantMoney() {
        money += mother.giveMoney()
    }
}