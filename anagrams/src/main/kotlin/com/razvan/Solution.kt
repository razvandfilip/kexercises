package com.razvan

fun anagram(one: String, two: String): Boolean {
    val map = mutableMapOf<Char, Int>()
    for (char in one) {
        map[char] = (map[char] ?: 0) + 1
    }
    for (char in two) {
        map[char] = (map[char] ?: 0) - 1
    }
    return map.filterValues { it != 0 }.isEmpty()
}