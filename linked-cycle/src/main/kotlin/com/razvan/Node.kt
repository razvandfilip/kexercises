package com.razvan

data class Node(
    var info: Int,
    var link: Node?
) {
    override fun toString(): String {
        return "$info->${link?.info}"
    }
}