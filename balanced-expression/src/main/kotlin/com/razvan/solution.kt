package com.razvan

fun isBalanced(expression: String): Boolean {

    val arrayDeque = ArrayDeque<Char>()
    val close = mapOf('}' to '{', ']' to '[', ')' to '(')

    for (char in expression) {
        when (char) {
            '{', '[', '(' -> arrayDeque.addLast(char)
            '}', ']', ')' -> {
                if (arrayDeque.removeLastOrNull() != close[char]) return false
            }
            else -> return false
        }
    }

    return arrayDeque.isEmpty()
}