package com.arvin.studio.android_test_sample

import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.spyk
import io.mockk.verify
import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class MotherTest {

    @RelaxedMockK
    lateinit var mother: Mother

    lateinit var motherSpy: Mother

    lateinit var kid: Kid

    @Before
    fun setUp() {
        MockKAnnotations.init(this)
        kid = Kid(mother)
        motherSpy = spyk(Mother())
    }

    @Test
    fun wantMoney() {
        // Given
        every { mother.giveMoney() } returns 30

        // When
        kid.wantMoney()
        // Then
        verify { mother.inform(any()) }
        assertEquals(30, kid.money)
        assertEquals("Arvin", motherSpy.giveMsgArvin())
    }
}