package com.arvin.studio.android_test_sample

import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotSame
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class BaseUnitTest {

    lateinit var mother: Mother

    @Before
    fun setUp() {
        mother = Mother()
    }

    @Test
    fun equalMoneyTest() {
        assertEquals(mother.giveMoney(), 100)
    }

    @Test
    fun notEqualMoneyTest() {
        assertNotSame(mother.giveMoney(), 0)
    }

    @Test
    fun equalMsgTest() {
        assertEquals(mother.giveMsgArvin(), "Arvin")
    }

    @Test
    fun notTrueTest() {
        assertNotSame(mother.giveTrueArvin(), false)
    }

    @After
    fun tearDown() {

    }
}