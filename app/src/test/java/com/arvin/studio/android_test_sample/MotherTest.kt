package com.arvin.studio.android_test_sample

import io.mockk.*
import io.mockk.impl.annotations.MockK
import junit.framework.Assert.assertEquals
import net.bytebuddy.matcher.ElementMatchers.any
import org.junit.Before
import org.junit.Test

class MotherTest {

    @MockK
    lateinit var mother: Mother

    lateinit var kid: Kid

    @Before
    fun setUp() {
        MockKAnnotations.init(this)
        kid = Kid(mother)
    }

    @Test
    fun wantMoney() {
        // Given
        every { mother.giveMoney() } returns 30
        every { mother.inform(any()) } just Runs

        // When
        kid.wantMoney()
        // Then
        verify { mother.giveMsgArvin() }
        assertEquals(30, kid.money)
    }
}