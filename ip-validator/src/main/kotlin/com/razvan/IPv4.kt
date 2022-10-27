package com.razvan

fun isIPv4(ip: String): Boolean {

    val split = ip.split(".")

    if (split.size != 4) return false

    for (section in split) {
        val numeric = section.toIntOrNull() ?: return false
        if (numeric.toString() != section) return false
    }

    return true
}