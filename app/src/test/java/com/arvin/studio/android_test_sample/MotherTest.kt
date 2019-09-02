package com.arvin.studio.android_test_sample

import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import junit.framework.Assert.assertEquals
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

        // When
        kid.wantMoney()
        // Then
        assertEquals(30, kid.money)
    }
}