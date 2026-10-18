class FirstNonRepeatingCharacter {

    fun findFirstNonRepeatingCharacter(input: String): Char? {
        val charactersCount = mutableMapOf<Char, Int>()
        for(char in input) {
            charactersCount[char] = charactersCount.getOrDefault(char, 0) + 1
        }

        for(char in input) {
            if (charactersCount[char] == 1) {
                return char
            }
        }

        return null
    }
}