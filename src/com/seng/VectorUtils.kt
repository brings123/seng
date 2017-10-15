package com.seng

/**
 * Sorts the array according to the natural order of its elements.
 * Uses a very un-optimised implementation of bubble sort, should only be used
 * for small arrays.
 * Please use [Array.sort] instead.
 */
fun Array<Int>.sort(): Array<Int> {
    for (i in this.indices)
        for (j in this.indices)
            if (this[j] > this[i]) {
                val s = this[j]
                this[j] = this[i]
                this[i] = s
            }
    return this
}

/**
 * Adds all elements in an int array to the elements of another and returns a new array.
 */
fun Array<Int>.add(other: Array<Int>): Array<Int> {
    assert(this.size == other.size)
    val result = Array(this.size, {0})
    for (i in this.indices) {
        result[i] = this[i] + other[i]
    }
    return result
}

/**
 * Inverts the order of an array's elements. Please use [Array.reverse] instead.
 */
fun Array<Int>.invert(): Array<Int> {
    val result = Array(this.size, {0})
    for(i in this.indices) {
        result[this.size - (i+1)] = this[i]
    }
    return result
}

/**
 * Returns a [Pair] containing the minimum and maximum of an array.
 *
 * @return a [Pair] containing the minimum in the first and maximum in the second,
 * or (null, null) for an empty array
 */
fun Array<Int>.getMinMax(): Pair<Int?, Int?> {
    val min = this.min()
    val max = this.max()

    return Pair(min, max)
}

/**
 *  Applies the given function on all elements of the array.
 *
 *  @param func the function to apply
 */
fun Array<Int>.apply(func: (value: Int) -> Int): Array<Int> {
    return this.map(func).toTypedArray()
}