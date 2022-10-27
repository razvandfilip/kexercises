package com.razvan

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class NDigitTest {

    @Test
    fun test8() {
        val expected = setOf("12345678",
            "12345679",
            "12345689",
            "12345789",
            "12346789",
            "12356789",
            "12456789",
            "13456789",
            "23456789")
        assertThat(nDigit(8)).isEqualTo(expected)
    }

    @Test
    fun test7() {
        val expected = setOf(
            "1234567","1234568","1234569","1234578","1234579","1234589","1234678","1234679","1234689","1234789","1235678","1235679","1235689","1235789","1236789","1245678","1245679","1245689","1245789","1246789","1256789","1345678","1345679","1345689","1345789","1346789","1356789","1456789","2345678","2345679","2345689","2345789","2346789","2356789","2456789","3456789"
        )

        assertThat(nDigit(7)).isEqualTo(expected)
    }
}