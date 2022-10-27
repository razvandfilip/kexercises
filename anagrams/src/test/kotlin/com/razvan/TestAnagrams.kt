package com.razvan

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TestAnagrams {

    @Test
    fun test() {
        val one = "silent"
        val two = "listen"
        assertThat(anagram(one, two)).isTrue()
    }

    @Test
    fun test2() {
        val one = "silegt"
        val two = "listen"
        assertThat(anagram(one, two)).isFalse()
    }
}