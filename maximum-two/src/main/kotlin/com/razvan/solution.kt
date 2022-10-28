package com.razvan

fun maxTwo(array: IntArray): Pair<Int, Int> {
    var iFirstMax: Int
    var iSecondMax: Int
    var iFirstMin: Int
    var iSecondMin: Int

    if (array[0] < array[1]) {
        iFirstMax = 1
        iSecondMax = 0
        iFirstMin = 0
        iSecondMin = 1
    } else {
        iFirstMax = 0
        iSecondMax = 1
        iFirstMin = 1
        iSecondMin = 0
    }

    for (i in 2 until array.size) {
        if (array[i] > array[iFirstMax]) {
            iSecondMax = iFirstMax
            iFirstMax = i
        } else if (array[i] > array[iSecondMax]) {
            iSecondMax = i
        }

        if (array[i] < array[iFirstMin]) {
            iSecondMin = iFirstMin
            iFirstMin = i
        } else if (array[i] < array[iSecondMin]) {
            iSecondMin = i
        }
    }

    return if (array[iFirstMax] * array[iSecondMax] > array[iFirstMin] * array[iSecondMin]) {
        Pair(array[iFirstMax], array[iSecondMax])
    } else {
        Pair(array[iFirstMin], array[iSecondMin])
    }
}