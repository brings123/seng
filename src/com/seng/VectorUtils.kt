package com.seng

class VectorUtils {
    fun <T: Comparable<T>> sort(array: Array<T>) {
        for (i in array.indices) {
            for (j in array.indices) {
                if(array[j] > array[i]) {
                    val s = array[j]
                    array[j] = array[i]
                    array[i] = s
                }
            }
        }
    }
}