package two_sum

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var array: IntArray = intArrayOf(-999, -999)
        run loop@{
            nums.forEachIndexed { index, i ->
                for (j in index + 1 until nums.size) {
                    if (i + nums[j] == target) {
                        array = intArrayOf(index, j)
                        return@loop
                    }
                }
            }
        }
        return array
    }
}


fun main() {
    val s = Solution()

    // Examples
    println("Example 1:")
    println("   Input: nums = [2,7,11,15], target = 9")
    println("   Output: " + s.twoSum(nums = intArrayOf(2, 7, 11, 15), target = 9).toList())

    println("Example 2:")
    println("   Input: nums = [3,2,4], target = 6")
    println("   Output: " + s.twoSum(nums = intArrayOf(3, 2, 4), target = 6).toList())

    println("Example 3:")
    println("   Input: nums = [3,3], target = 6")
    println("   Output: " + s.twoSum(nums = intArrayOf(3, 3), target = 6).toList())

    println()
    // Test out of bounds
    println("Test out of bounds: " + s.twoSum(nums = intArrayOf(3, 2, 3), target = 6).toList())
}
