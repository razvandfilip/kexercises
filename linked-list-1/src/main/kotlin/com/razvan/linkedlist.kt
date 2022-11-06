package com.razvan

import java.util.NoSuchElementException

class Node<T>(var value: T) {
    var link: Node<T>? = null
}

class LinkedList<T>: Iterable<T> {
    var head: Node<T>? = null

    override fun iterator(): Iterator<T> = LinkedListIterator(this)

    companion object {
        fun <T> linkedListOf(vararg elements: T): LinkedList<T> {
            val linkedList = LinkedList<T>()
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

class LinkedListIterator<T>(linkedList: LinkedList<T>) : Iterator<T> {

    var currentNode: Node<T>? = linkedList.head

    override fun hasNext(): Boolean {
        return currentNode != null
    }

    override fun next(): T = currentNode?.let {
        val ret = it.value
        currentNode = it.link
        ret
    } ?: throw NoSuchElementException()
}