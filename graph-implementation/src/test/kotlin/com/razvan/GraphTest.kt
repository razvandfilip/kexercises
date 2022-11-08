package com.razvan

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GraphTest {

    @Test
    fun testDigraphAdjacency() {

        val edges = listOf(
            Edge(0, 1), Edge(1, 2), Edge(2, 0), Edge(2, 1), Edge(3, 2), Edge(4, 5), Edge(5, 4)
        )
        val graph = Graph(edges)
        assertThat(graph.toString()).isEqualTo("""
            (0 --> 1)
            (1 --> 2)
            (2 --> 0)    (2 --> 1)
            (3 --> 2)
            (4 --> 5)
            (5 --> 4)
        """.trimIndent())

    }
}