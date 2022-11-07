package com.razvan

fun count(matrix: Array<Array<Int>>): Int {

    var count = 0

    var i = 0
    var j = matrix[0].size - 1

    while (j >= 0 && i < matrix.size) {
        if (matrix[i][j] < 0) {
            count += j + 1
            i++
        } else {
            j--
        }
    }

    return count
}