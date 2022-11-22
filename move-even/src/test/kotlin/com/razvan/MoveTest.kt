package com.razvan

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MoveTest {

    @Test
    fun testMove() {
        val input = LList.linkedListOf(1, 2, 3, 4, 5, 6, 7)
        input.reorderEven()
        assertThat(input).containsExactly(1, 3, 5, 7, 6, 4, 2)
    }

    @Test
    fun testMove2() {
        val input = LList.linkedListOf(8, 1, 2, 3, 4, 5, 6, 7)
        input.reorderEven()
        assertThat(input).containsExactly(1, 3, 5, 7, 6, 4, 2, 8)
    }
}