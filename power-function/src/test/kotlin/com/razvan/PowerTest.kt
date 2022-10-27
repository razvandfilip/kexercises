package com.razvan

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import kotlin.math.pow

class PowerTest {

    @Test
    fun testTwoThree() {
        assertThat(power(2, 3)).isEqualTo(2.0.pow(3.0).toInt())
    }
}