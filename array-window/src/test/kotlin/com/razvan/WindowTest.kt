package com.razvan

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WindowTest {

    @Test
    fun test1() {
        val array = intArrayOf(1, 2, 3, 7, 5, 6, 4, 8)
        val result = window(array)
        assertThat(result.first).isEqualTo(3)
        assertThat(result.second).isEqualTo(6)
    }

    @Test
    fun test2() {
        val array = intArrayOf(1, 3, 2, 7, 5, 6, 4, 8)
        val result = window(array)
        assertThat(result.first).isEqualTo(1)
        assertThat(result.second).isEqualTo(6)
    }

    @Test
    fun test3() {
        val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)
        val result = window(array)
        assertThat(result.first).isEqualTo(-1)
        assertThat(result.second).isEqualTo(-1)
    }
}