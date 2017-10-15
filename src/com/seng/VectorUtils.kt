package com.seng

fun Array<Int>.sort(): Array<Int> {
    for (i in this.indices) {
        for (j in this.indices) {
            if (this[j] > this[i]) {
                val s = this[j]
                this[j] = this[i]
                this[i] = s
            }
        }
    }
    return this
}

fun Array<Int>.add(other: Array<Int>): Array<Int> {
    assert(this.size == other.size)
    val result = Array(this.size, {0})
    for (i in this.indices) {
        result[i] = this[i] + other[i]
    }
    return result
}