package com.razvan

import java.util.NoSuchElementException

class Node(var data: Int) {
    var link: Node? = null
}

class LList: Iterable<Int> {
    var head: Node? = null

    override fun iterator(): Iterator<Int> = LListIterator(this)

    fun reorderEven() {
        var previous: Node? = null
        var current = head
        var evensHead: Node? = null

        while (current != null) {
            if (current.data % 2 == 0) {
                if (previous == null) {
                    head = head!!.link
                    current.link = evensHead
                    evensHead = current
                    current = head
                } else {
                    previous.link = current.link
                    current.link = evensHead
                    evensHead = current
                    current = previous.link
                }
            } else {
                previous = current
                current = current.link
            }
        }

        previous!!.link = evensHead
    }

    companion object {
        fun linkedListOf(vararg elements: Int): LList {
            val linkedList = LList()
            for (i in (elements.indices).reversed()) {
                val data = elements[i]
                val node = Node(data).apply {
                    link = linkedList.head
                }
                linkedList.head = node
            }
            return linkedList
        }
    }
}

class LListIterator(linkedList: LList) : Iterator<Int> {

    var currentNode: Node? = linkedList.head

    override fun hasNext(): Boolean {
        return currentNode != null
    }

    override fun next(): Int = currentNode?.let {
        val ret = it.data
        currentNode = it.link
        ret
    } ?: throw NoSuchElementException()
}