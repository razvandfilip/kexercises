package com.razvan

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IPTest {

    @Test
    fun testIPv4() {
        assertThat(isIPv4("192.168.0.1")).isTrue
    }

    @Test
    fun testIPv4false() {
        assertThat(isIPv4("192.168.b.1")).isFalse
    }

    @Test
    fun testIPv4false2() {
        assertThat(isIPv4("192.168.01.1")).isFalse
    }

    @Test
    fun testIPv6() {
        assertThat(isIPv6("2001:0db8:85a3:0000:0000:8a2e:0370:7334")).isTrue
    }

    @Test
    fun testIPv62() {
        assertThat(isIPv6("2001:db8:85a3:0:0:8A2E:0370:7334")).isTrue
    }

    @Test
    fun testIPv6false() {
        assertThat(isIPv6("2001:0db8:85a3::8A2E:037j:7334")).isFalse
    }

    @Test
    fun testIPv6false2() {
        assertThat(isIPv6("02001:0db8:85a3:0000:0000:8a2e:0370:7334")).isFalse
    }
}