package com.razvan

fun containsDuplicate(expression: String): Boolean {

    val arrayDeque = ArrayDeque<Char>()

    for (char in expression) {
        if (char != ')') {
            arrayDeque.addLast(char)
        } else {
            if (arrayDeque.lastOrNull() == '(') return true

            while (arrayDeque.lastOrNull() != null && arrayDeque.lastOrNull() != '(') {
                arrayDeque.removeLast()
            }
            if (arrayDeque.lastOrNull() == '(') arrayDeque.removeLast()
        }
    }

    println(arrayDeque.joinToString(""))

    return false
}