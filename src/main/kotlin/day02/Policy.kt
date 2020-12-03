package main.kotlin.day02

data class Policy(val min : Int, val max :  Int, val letter: Char, val password : String) {
    fun isValid(): Boolean {
        val toComply = password.count{ char -> char == letter }
        return toComply in min..max
    }

    fun isExactMatch(): Boolean {
        val firstMatch = password[min - 1]
        val secondMatch = password[max - 1]
        return (letter == firstMatch || letter == secondMatch) && !(letter == firstMatch && letter == secondMatch)
    }
}
