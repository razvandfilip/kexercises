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
        assertThat(graph.toString()).isEqualTo(
            """
            (0 --> 1)
            (1 --> 2)
            (2 --> 0)    (2 --> 1)
            (3 --> 2)
            (4 --> 5)
            (5 --> 4)
        """.trimIndent()
        )
    }

    @Test
    fun testWeightedDigraphAdjacency() {

        val edges = listOf(
            WeightedEdge(0, 1, 6),
            WeightedEdge(1, 2, 7),
            WeightedEdge(2, 0, 5),
            WeightedEdge(2, 1, 4),
            WeightedEdge(3, 2, 10),
            WeightedEdge(4, 5, 1),
            WeightedEdge(5, 4, 3)
        )
        val graph = WeightedGraph(edges)
        assertThat(graph.toString()).isEqualTo(
            """
            (0 --> 1 (6))
            (1 --> 2 (7))
            (2 --> 0 (5))    (2 --> 1 (4))
            (3 --> 2 (10))
            (4 --> 5 (1))
            (5 --> 4 (3))
        """.trimIndent()
        )
    }
}