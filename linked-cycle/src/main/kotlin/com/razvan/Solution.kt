package com.razvan

fun LList.cycle(): Boolean {

    var slow: Node? = start
    var fast: Node? = start

    val t2 = advance(slow to fast)
    slow = t2.first
    fast = t2.second

    if (slow == null || fast == null) {
        return false
    }

    if (slow == fast) {
        return true
    }

    while (slow != null && fast != null && slow != fast) {
        val temp = advance(slow to fast)
        slow = temp.first
        fast = temp.second
    }

    return (slow != null && fast != null)
}

fun advance(nodes: Pair<Node?, Node?>): Pair<Node?, Node?> = Pair(nodes.first?.link, nodes.second?.link?.link)