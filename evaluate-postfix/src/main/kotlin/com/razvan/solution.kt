package com.razvan

fun evaluate(expression: String): Int {

    val deque = ArrayDeque<Int>()

    for (char in expression) {
        when (char) {
            '+', '-', '*', '/' -> {
                val op2 = deque.removeLast()
                val op1 = deque.removeLast()
                when (char) {
                    '+' -> deque.addLast(op1 + op2)
                    '-' -> deque.addLast(op1 - op2)
                    '*' -> deque.addLast(op1 * op2)
                    '/' -> deque.addLast(op1 / op2)
                    else -> TODO()
                }
            }
            else -> {
                deque.addLast(char.digitToInt())
            }
        }
    }
    return deque.single()
}