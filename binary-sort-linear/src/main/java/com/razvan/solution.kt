package com.razvan

fun Array<Int>.sortLinear() {
    val zeroes = this.count { it == 0 }
    for (i in 0 until zeroes) {
        this[i] = 0
    }
    for (i in zeroes until this.size) {
        this[i] = 1
    }
}