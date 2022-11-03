package com.razvan

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TestDuplicate {

    @Test
    fun testDuplicate1() {
        val expression = "((x+y))+z"
        assertThat(containsDuplicate(expression)).isTrue
    }

    @Test
    fun testDuplicate2() {
        val expression = "((x+y)+((z)))"
        assertThat(containsDuplicate(expression)).isTrue
    }

    @Test
    fun testNoDuplicate() {
        val expression = "(x+y)"
        assertThat(containsDuplicate(expression)).isFalse
    }
}