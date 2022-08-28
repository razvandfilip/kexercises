package com.razvan

import com.razvan.ZeroSumTest.SolutionAssertions.Companion.assertThat
import org.assertj.core.api.AbstractObjectAssert
import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ZeroSumTest {

    @Test
    fun myTest1() {

        val input = listOf(4, 2, -3, -1, 0, 4)

        val solutions = ZeroSum(input).solve()

        assertThat(solutions.size).isEqualTo(2)

        solutions.forEach {
            assertThat(it).isSolution(input)
        }
    }

    @Test
    fun myTest2() {

        val input = listOf(3, 4, -7, 3, 1, 3, 1, -4, -2, -2)

        val solutions = ZeroSum(input).solve()

        assertThat(solutions.size).isEqualTo(6)

        solutions.forEach {
            assertThat(it).isSolution(input)
        }
    }

    class SolutionAssert(actual: Solution): AbstractObjectAssert<SolutionAssert, Solution>(actual, SolutionAssert::class.java) {
        fun isSolution(input: List<Int>): SolutionAssert {
            assertThat(input.subList(actual.start, actual.start + actual.size).sum()).isEqualTo(0)
            return this;
        }
    }

    class SolutionAssertions: Assertions() {
        companion object {
            fun assertThat(actual: Solution) = SolutionAssert(actual)
        }
    }

}
