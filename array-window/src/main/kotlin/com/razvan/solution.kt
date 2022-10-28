package com.razvan

fun window(array: IntArray): Pair<Int, Int> {

    var maxSoFar = Int.MIN_VALUE
    var minSoFar = Int.MAX_VALUE
    var rightIndex = -1
    var leftIndex = -1
    for (i in array.indices) {
        if (array[i] > maxSoFar) maxSoFar = array[i]
        if (array[i] < maxSoFar) rightIndex = i
    }

    for (i in array.indices.reversed()) {
        if (array[i] < minSoFar) minSoFar = array[i]
        if (array[i] > minSoFar) leftIndex = i
    }

    return Pair(leftIndex, rightIndex)
}