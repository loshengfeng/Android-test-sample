package com.arvin.studio.android_test_sample

import io.mockk.*
import io.mockk.impl.annotations.MockK
import io.mockk.impl.annotations.RelaxedMockK
import junit.framework.Assert.assertEquals
import net.bytebuddy.matcher.ElementMatchers.any
import org.junit.Before
import org.junit.Test

class MotherTest {

    @RelaxedMockK
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

        // When
        kid.wantMoney()
        // Then
        verify { mother.inform(any()) }
        assertEquals(30, kid.money)
        assertEquals("Arvin", mother.giveMsgArvin())
    }
}