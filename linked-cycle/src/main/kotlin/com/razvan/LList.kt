package com.razvan

data class LList private constructor(
    val start: Node
) {

    constructor(nodes: List<Int>) : this(Node(nodes.first(), null)) {
        nodes.drop(1).forEach(::append)
    }

    private fun append(i: Int) {
        last().link = Node(i, null)
    }

    private fun last(): Node {
        var current: Node? = start
        while (current!!.link != null) {
            current = current.link
        }
        return current
    }
}