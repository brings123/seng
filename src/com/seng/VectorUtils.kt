package com.seng

class VectorUtils {

    fun <T: Comparable<T>> sort(array: Array<T>) {
        for (i in array.indices) {
            for (j in array.indices) {
                if (array[j] > array[i]) {
                    val s = array[j]
                    array[j] = array[i]
                    array[i] = s
                }
            }
        }
    }

    inline fun <reified T: Number> add(first: Array<T>, second: Array<T>): Array<T> {
        val result = arrayOf<T>()
        assert(first.size == second.size)
        for (i in first.indices) {
            result[i] = first[i] + second[i]
        }
        return result
    }

    operator fun <T: Number> T.plus(other: T): T {
        return this + other
    }
}