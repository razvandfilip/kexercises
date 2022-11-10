package com.razvan

fun String.rotatedPalindrome2(): Boolean {
    val deque = ArrayDeque<Char>()
    this.forEach {
        if (it == deque.lastOrNull()) deque.removeLast()
        else deque.addLast(it)
    }
    return deque.size <= 1
}

fun String.rotatedPalindrome(): Boolean {
    val res = this.fold("") { acc, c ->
        if(c == acc.lastOrNull()) acc.dropLast(1)
        else acc + c
    }
    return res.length <= 1
}