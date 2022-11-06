package com.razvan

fun processSequence(sequence: String): String {

    val deque = ArrayDeque<Char>()
    var result = ""

    for (i in 0..sequence.length) {
        deque.addLast((i + 1).toString().first())
        if (i == sequence.length || sequence[i] == 'I') {
            while (!deque.isEmpty()) {
                result += deque.removeLast()
            }
        }

    }
    return result
}