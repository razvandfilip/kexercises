package com.razvan

fun remove(input: String): String {
    val deque = ArrayDeque<String>()
    for (letter in input) {
        if (letter != 'C') {
            val top = deque.removeLastOrNull()
            if (top == null) {
                deque.addLast(letter.toString())
            } else if (top != "A" || letter != 'B') {
                deque.addLast(top)
                deque.addLast(letter.toString())
            }
        }
    }
    return deque.joinToString("")
}

fun remove2(input: String): String {
    val array = input.toCharArray()
    var currentTop = 0
    for (i in array.indices) {
        if (array[i] == 'B' && (currentTop > 0 && array[currentTop - 1] == 'A')) {
            currentTop--
        } else if (array[i] != 'C') {
            array[currentTop] = array[i]
            currentTop++
        }

    }
    return array.joinToString("").substring(0, currentTop)
}












