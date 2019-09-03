package com.arvin.studio.android_test_sample

import android.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MainViewModelTest {
    @get:Rule
    val rule = InstantTaskExecutorRule()

    private lateinit var viewModel: MainViewModel

    @Before
    fun setUp() {
        viewModel = MainViewModel()

    }

    @Test
    fun mainTest() {
        viewModel.total()
        assertEquals("2", viewModel.result.value)
    }

    @Test
    fun main2Test() {
        viewModel.changeBoolean()
        assertEquals(true, viewModel.isIntent.value)
    }
}