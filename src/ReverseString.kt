class ReverseString {
    fun reverse(input: String): String {
        val inputArray = input.toCharArray()
        var start = 0
        var end = input.length - 1

        while (start <= end) {
            val temp = inputArray[start]
            inputArray[start] = inputArray[end]
            inputArray[end] = temp
            start++
            end--
        }
        return inputArray.concatToString()
    }
}