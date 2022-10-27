package com.razvan

fun power(x: Int, y: Int): Int {
    if (y == 0) return 1

    var result = 0
    val minus1 = power(x, y - 1)

    for (i in 1..x) {
        result += minus1
    }

    return result
}
