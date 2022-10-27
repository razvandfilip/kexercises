package com.razvan

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RemoveTest {

    @Test
    fun test1() {
        val input = "CBAABCAB"
        val expected = "BA"
        assertThat(remove2(input)).isEqualTo(expected)
    }

    @Test
    fun test2() {
        val input = "ABACB"
        val expected = ""
        assertThat(remove2(input)).isEqualTo(expected)
    }

    @Test
    fun test3() {
        val input = "ABCACBCAABB"
        val expected = ""
        assertThat(remove2(input)).isEqualTo(expected)
    }
}