package com.razvan

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CycleTest {

    @Test
    fun test1() {
        val llist = LList(listOf(1, 2, 3))

        assertThat(llist.cycle()).isFalse()
    }

    @Test
    fun test2() {
        val llist = LList(listOf(1, 2, 3, 4, 5))

        var movable: Node? = llist.start
        movable = movable!!.link
        movable = movable!!.link

        val third: Node = movable!!

        movable = movable.link
        movable = movable!!.link

        val fifth: Node = movable!!

        fifth.link = third

        assertThat(llist.cycle()).isTrue()
    }
}
