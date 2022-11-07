package com.razvan

fun segregate(array: Array<Int>) {
    var left = 0
    var right = array.size - 1

    while (left < right) {
        if (array[left] < 0) left++
        if (array[right] > 0) right--
        if (array[left] > array[right]) {
            val tmp = array[left]
            array[left] = array[right]
            array[right] = tmp
        }
    }
}