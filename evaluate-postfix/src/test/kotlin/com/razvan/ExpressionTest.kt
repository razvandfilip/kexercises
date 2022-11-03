package com.razvan

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExpressionTest {

    @Test
    fun testExpression1() {
        val expression = "82/"
        assertThat(evaluate(expression)).isEqualTo(4)
    }

    @Test
    fun testExpression2() {
        val expression = "138*+"
        assertThat(evaluate(expression)).isEqualTo(25)
    }

    @Test
    fun testExpression3() {
        val expression = "545*+5/"
        assertThat(evaluate(expression)).isEqualTo(5)
    }
}