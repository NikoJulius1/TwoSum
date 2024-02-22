package com.example.intro


fun main() {
    println(twoSum(intArrayOf(3, 3), 6))
}

fun twoSum(nums: IntArray, target: Int): String {
    val numMap = mutableMapOf<Int, Int>()

    for ((index, value) in nums.withIndex()) {
        val complement = target - value
        if (numMap.containsKey(complement)) {
            return "${numMap[complement]}, $index"
        }
        numMap[value] = index
    }
    return "False"
}