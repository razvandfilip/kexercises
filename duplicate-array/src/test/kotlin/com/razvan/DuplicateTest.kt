package com.razvan

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DuplicateTest {

    @Test
    fun test1() {
        val array = arrayOf(1, 2, 3, 4, 4)
        assertThat(array.findDuplicate()).isEqualTo(4)
    }

    @Test
    fun test2() {
        val array = arrayOf(1, 2, 3, 4, 2)
        assertThat(array.findDuplicate()).isEqualTo(2)
    }
}