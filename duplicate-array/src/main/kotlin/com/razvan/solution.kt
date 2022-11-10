package com.razvan

fun Array<Int>.findDuplicate(): Int = ((1 until size) + this).reduce(Int::xor)