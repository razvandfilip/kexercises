package com.razvan

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RotatedTest {

    @Test
    fun test1() {
        assertThat("CBAABCD".rotatedPalindrome()).isTrue
    }

    @Test
    fun test2() {
        assertThat("BAABCC".rotatedPalindrome()).isTrue
    }

    @Test
    fun test3() {
        assertThat("CBAABCDE".rotatedPalindrome()).isFalse
    }
}