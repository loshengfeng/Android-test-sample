package com.arvin.studio.android_test_sample

import io.mockk.every
import io.mockk.mockk
import junit.framework.Assert.assertEquals
import org.junit.Test

class MotherTest {

    @Test
    fun wantMoney() {
        // Given
        val mother = mockk<Mother>()
        val kid = Kid(mother)
        every { mother.giveMoney() } returns 30

        // When
        kid.wantMoney()
        // Then
        assertEquals(30, kid.money)
    }
}