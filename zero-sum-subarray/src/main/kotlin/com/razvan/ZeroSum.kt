package com.razvan

class ZeroSum(val input: List<Int>) {

    fun solve(): Set<Solution> {

        return betterSolution()
    }

    private fun firstSolution(): Set<Solution> {

        val result = mutableSetOf<Solution>()

        for (i in input.indices) {
            for (j in 0..i) {
                if (input.subList(j, i + 1).sum() == 0) {
                    result.add(Solution(j, i - j + 1))
                }
            }
        }
        return result
    }

    private fun betterSolution(): Set<Solution> {

        val result = mutableSetOf<Solution>()

        val search = mutableMapOf<Int, List<Int>>()

        val sums = input.runningFold(0) { acc: Int, i: Int -> acc + i }
        sums.forEachIndexed { index, i -> println("[${index-1}]:$i") }

        sums.forEachIndexed { index, sum ->
            if (search.contains(sum)) {

                result.addAll(search[sum]!!.map { Solution(it + 1, index - it - 1) })
            }
            search.merge(sum, listOf(index - 1), Collection<Int>::plus)
        }

        return result
    }
}
