package com.razvan

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SortTest {

    @Test
    fun testSort() {
        val array = arrayOf(1, 0, 1, 0, 1, 0, 0, 1)
        array.sortLinear()
        assertThat(array).isEqualTo(arrayOf(0, 0, 0, 0, 1, 1, 1, 1))
    }

    @Test
    fun testSort2() {
        val array = arrayOf(0, 0, 1, 0, 1, 1, 0, 1, 0, 0)
        array.sortLinear()
        assertThat(array).isEqualTo(arrayOf(0, 0, 0, 0, 0, 0, 1, 1, 1, 1))
    }
}