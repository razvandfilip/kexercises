package com.razvan

fun nDigit(n: Int): Set<String> {
    return ceva("", n)
}

fun ceva(current: String, n: Int): Set<String> {
    if (current.length == n) {
       return setOf(current)
    }
    val lastDigitChar = current.lastOrNull() ?: '0'
    val lastDigit = lastDigitChar.digitToInt()
    val remainingDigits = (lastDigit+1)..9
    val mutableSet = emptySet<String>().toMutableSet()
    return remainingDigits.flatMapTo(mutableSet) { i -> ceva(current + i.toString(), n) }
}












