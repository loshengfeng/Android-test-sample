package com.arvin.studio.android_test_sample

import android.support.test.espresso.Espresso
import android.support.test.espresso.assertion.ViewAssertions
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test

class ResultActivityTest {

    @Rule
    @JvmField
    val rule  = ActivityTestRule(ResultActivity::class.java)

    @Test
    fun firstTest() {
        Espresso.onView(ViewMatchers.withId(R.id.result))
            .check(ViewAssertions.matches(ViewMatchers.withText("Hello World")))

    }
}