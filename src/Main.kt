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
}