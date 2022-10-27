package com.razvan

fun isIPv6(ip: String): Boolean {

    val split = ip.split(":")
    if (split.size != 8) return false
    for (section in split) {
        if (section.length > 4) return false
        section.toIntOrNull(16) ?: return false
    }
    return true
}