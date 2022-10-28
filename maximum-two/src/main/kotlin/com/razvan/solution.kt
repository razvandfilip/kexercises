package com.razvan


fun maxTwo(array: IntArray): Pair<Int, Int> {
    var imax: Int? = null
    var imax2: Int? = null
    for (i in array.indices) {
        if (array[i] >= 0) {
            if (imax == null) {
                imax = i
            } else if(array[i] > array[imax]) {
                imax = i
            }
        }
    }
    if (imax != null) {
        for (i in array.indices) {
            if (array[i] >= 0 && i != imax) {
                if (imax2 == null) {
                    imax2 = i
                } else if(array[i] > array[imax2]) {
                    imax2 = i
                }
            }
        }
    }

    var imin: Int? = null
    var imin2: Int? = null
    for (i in array.indices) {
        if (array[i] <= 0) {
            if (imin == null) {
                imin = i
            } else if(array[i] < array[imin]) {
                imin = i
            }
        }
    }
    if (imin != null) {
        for (i in array.indices) {
            if (array[i] <= 0 && i != imin) {
                if (imin2 == null) {
                    imin2 = i
                } else if(array[i] < array[imin2]) {
                    imin2 = i
                }
            }
        }
    }

    val maxProduct = product(imax?.let { array[it] }, imax2?.let { array[it] })
    val minProduct = product(imin?.let { array[it] }, imin2?.let { array[it] })

    if (maxProduct != null && minProduct != null) {
        if (maxProduct > minProduct) {
            return Pair(array[imax!!], array[imax2!!])
        } else {
            return Pair(array[imin!!], array[imin2!!])
        }
    } else {
        if (maxProduct != null) {
            return Pair(array[imax!!], array[imax2!!])
        } else if (minProduct != null) {
            return Pair(array[imin!!], array[imin2!!])
        } else {
            return Pair(array[imax!!], array[imin!!])
        }
    }
}

fun product(one: Int?, two: Int?): Int? {
    if (one == null || two == null) {
        return null
    } else {
        return one * two
    }
}

fun maxTwo2(array: IntArray): Pair<Int, Int> {
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