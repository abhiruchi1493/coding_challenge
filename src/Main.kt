//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    val reverseString = ReverseString()
    val input = "sample"
    val reversed = reverseString.reverse(input)
    println("Original string: $input")
    println("Reversed string: $reversed")

    val firstNonRepeatingCharacter = FirstNonRepeatingCharacter()
    val inputString = "swiss"
    val firstNonRepeating = firstNonRepeatingCharacter.findFirstNonRepeatingCharacter(inputString)
    if (firstNonRepeating != null) {
        println("First non-repeating character in '$inputString' is: $firstNonRepeating")
    } else {
        println("No non-repeating character found in '$inputString'")
    }

    val stringAnagram = StringAnagram()
    val str1 = "test"
    val str2 = "silent"
    val areAnagrams = stringAnagram.areAnagrams(str1, str2)
    if (areAnagrams) {
        println("'$str1' and '$str2' are anagrams.")
    } else {
        println("'$str1' and '$str2' are not anagrams.")
    }

    val twoSum = TwoSum()
    val numbers = intArrayOf(1,2, 7,8, 11, 15)
    val target = 9
    val result = twoSum.twoSum(numbers, target)
    if (result.isNotEmpty()) {
        println("Indices of numbers that add up to $target are: ${result.joinToString(", ")}")
    } else {
        println("No two numbers add up to $target.")
    }
}