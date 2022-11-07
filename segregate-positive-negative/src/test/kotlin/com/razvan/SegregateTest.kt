package com.razvan

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SegregateTest {

    @Test
    fun test() {
        val array = arrayOf(9, -3, 5, -2, -8, -6, 1, 3)
        val modifiedArray = array.copyOf()
        segregate(modifiedArray)

        assertThat(modifiedArray).containsExactlyInAnyOrder(*array)

        if (modifiedArray.any { it < 0 } && modifiedArray.any { it > 0 }) {
            var i = 0

            while (modifiedArray[i] < 0) {
                i++
            }

            while (i < modifiedArray.size) {
                assertThat(modifiedArray[i]).isGreaterThan(0)
                i++
            }
        }
    }
}