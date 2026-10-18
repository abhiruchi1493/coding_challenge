class StringAnagram {

    fun areAnagrams(str1: String, str2: String): Boolean {

        val charactersCount = mutableMapOf<Char, Int>()
        for(char in str1) {
            charactersCount[char] = charactersCount.getOrDefault(char, 0) + 1
        }
        for(char in str2) {
            if(charactersCount[char] == null) return false
            charactersCount[char] = charactersCount[char]!! - 1
            if(charactersCount[char] == 0) charactersCount.remove(char)
        }

        return charactersCount.isEmpty()
    }

}