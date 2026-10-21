class TwoSum{

    fun twoSum(numbers: IntArray, target: Int): IntArray {
        numbers.sort()
        var start = 0
        var end = numbers.size - 1
        while (start < end) {
            print("Start: $start, End: $end, Numbers: ${numbers[start]}, ${numbers[end]}\n")
            val sum = numbers[start] + numbers[end]
            when {
                sum == target -> return intArrayOf(start + 1, end + 1)
                sum < target -> start++
                else -> end--
            }
        }
        return intArrayOf()
    }
}