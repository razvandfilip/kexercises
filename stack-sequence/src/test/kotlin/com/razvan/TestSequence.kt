package com.razvan

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TestSequence {
    @Test
    fun test1() {
        val sequence = "IIDDIDID"
        assertThat(processSequence(sequence)).isEqualTo("125437698")
    }
    @Test
    fun test2() {
        val sequence = "IDIDII"
        assertThat(processSequence(sequence)).isEqualTo("1325467")
    }
    @Test
    fun test3() {
        val sequence = "DDDD"
        assertThat(processSequence(sequence)).isEqualTo("54321")
    }
    @Test
    fun test4() {
        val sequence = "IIII"
        assertThat(processSequence(sequence)).isEqualTo("12345")
    }
}