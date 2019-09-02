package com.arvin.studio.android_test_sample

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.*
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test

class BaseUITest {

    @Rule
    @JvmField
    val rule  = ActivityTestRule(MainActivity::class.java)

    @Test
    fun keyHelloWorldTest() {
        onView((withId(R.id.editText))).perform(clearText())
        onView((withId(R.id.editText))).perform(typeText("hello world"))
        onView((withId(R.id.editText))).perform(clearText())
    }

    @Test
    fun keyHelloWorldTest2() {
        onView((withId(R.id.editText))).perform(clearText())
        onView((withId(R.id.editText))).perform(typeText("hello Arvin"))
        onView((withId(R.id.next))).perform(click())
        onView(withId(R.id.result)).check(matches(withText("Hello World")))
    }
}