package com.razvan

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MatrixTest {

    @Test
    fun testCount() {
        val matrix = arrayOf(
            arrayOf(-7, -3, -1, 3, 5), arrayOf(-3, -2, 2, 4, 6), arrayOf(-1, 1, 3, 5, 8), arrayOf(3, 4, 7, 8, 9)
        )
        assertThat(count(matrix)).isEqualTo(6)
    }
}