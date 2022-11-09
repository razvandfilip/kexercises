package com.razvan

import kotlin.math.max

class WeightedGraph(
    edges: List<WeightedEdge>
) {
    private val adjacencyList: List<List<Vec>>

    init {
        val maxVertex = edges.fold(0) {
                max, edge -> max(max, max(edge.start, edge.end))
        }

        val mutableList = mutableListOf<MutableList<Vec>>()
        for (i in 0..maxVertex) {
            mutableList.add(mutableListOf())
        }

        edges.forEach { (start, end, weight) ->
            (mutableList[start].add(Vec(end, weight)))
        }
        adjacencyList = mutableList
    }

    override fun toString(): String {
        return adjacencyList.mapIndexed { start, list ->
            list.joinToString(separator = "    ") { end -> "($start --> ${end.dest} (${end.weight}))" }
        }.joinToString(separator = "\n")
    }
}

class Graph(
    edges: List<Edge>
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
    val end: Int
)

data class WeightedEdge(
    val start: Int,
    val end: Int,
    val weight: Int
)

data class Vec(
    val dest: Int,
    val weight: Int
)

