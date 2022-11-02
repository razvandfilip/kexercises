package com.razvan

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExpressionTest {

    @Test
    fun testBalanced() {
        val input = "{[{}{}]}[()]"
        assertThat(isBalanced(input)).isTrue
    }

    @Test
    fun testBalanced2() {
        val input = "{{}{}}"
        assertThat(isBalanced(input)).isTrue
    }

    @Test
    fun testBalanced3() {
        val input = "[]{}()"
        assertThat(isBalanced(input)).isTrue
    }

    @Test
    fun testImbalanced() {
        val input = "{()}[)"
        assertThat(isBalanced(input)).isFalse
    }

    @Test
    fun testImbalanced2() {
        val input = "{(})"
        assertThat(isBalanced(input)).isFalse
    }
}