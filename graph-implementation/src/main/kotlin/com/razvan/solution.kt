package com.razvan

import kotlin.math.max

class Graph(
    edges: List<Edge>,
) {
    private val adjacencyList: List<List<Int>>

    init {

        val maxVertex = edges.fold(0) {
            max, edge -> max(max, max(edge.start, edge.end))
        }

        val mutableList = mutableListOf<MutableList<Int>>()
        for (i in 0..maxVertex) {
            mutableList.add(mutableListOf())
        }

        edges.forEach { (start, end) ->
            (mutableList[start].add(end))
        }
        adjacencyList = mutableList
    }

    override fun toString(): String {
        return adjacencyList.mapIndexed { start, list ->
            list.joinToString(separator = "    ") { end -> "($start --> $end)" }
        }.joinToString(separator = "\n")
    }
}

data class Edge(
    val start: Int,
    val end: Int,
)


