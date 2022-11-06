package com.razvan

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LinkedListTest {

    @Test
    fun testCreateList() {
        val list = LinkedList.linkedListOf(1, 2, 3, 4, 5)
        assertThat(list).containsExactly(1, 2, 3, 4, 5)
    }
}