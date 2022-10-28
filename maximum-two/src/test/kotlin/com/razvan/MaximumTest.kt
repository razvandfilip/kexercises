package com.razvan

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MaximumTest {

    @Test
    fun testMax() {
        val array = intArrayOf(-10, -3, 5, 6, -2)
        val result = maxTwo(array)
        assertThat(result.first * result.second).isEqualTo(30)
    }

    @Test
    fun testMax2() {
        val array = intArrayOf(-10, 1, 5, 6, 3)
        val result = maxTwo(array)
        assertThat(result.first * result.second).isEqualTo(30)
    }

    @Test
    fun testMax3() {
        val array = intArrayOf(-10, -3, -1, 55, -2)
        val result = maxTwo(array)
        assertThat(result.first * result.second).isEqualTo(30)
    }

    @Test
    fun testMax4() {
        val array = intArrayOf(-10, -3, 5, 6, 6)
        val result = maxTwo(array)
        assertThat(result.first * result.second).isEqualTo(36)
    }
}