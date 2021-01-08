package advent_of_code.puzzle

import advent_of_code.data.Day2Data

class Day2 : BaseDay() {

    fun validatePolicieWithRange(range: Pair<Int, Int>, character: Char, password: String) : Boolean {
        val nbPresentCharacter = password.filter { it == character }.length
        return nbPresentCharacter >= range.first && nbPresentCharacter <= range.second
    }

    fun validatePolicieWithPosition(position: Pair<Int, Int>, character: Char, password: String) =
        (password[position.first-1] == character && password[position.second-1] != character)
                || (password[position.first-1] != character && password[position.second-1] == character)

    fun convertLine(line: String): Day2Data {
        val lineFiltered = line.split(" ")
        val range = lineFiltered[0].split("-")
        val min = range[0].toInt()
        val max = range[1].toInt()
        val character = lineFiltered[1][0]
        val password = lineFiltered[2]

        return Day2Data(Pair(min, max), character, password)
    }

    override fun solve(inputs: List<String>): Pair<Any, Any> {
        val inputsAsDay2Data = inputs.map { convertLine(it) }

        val inputFilteredWithRange = inputsAsDay2Data.filter { validatePolicieWithRange(it.range, it.character, it.password) }
        val inputFilteredWithPosition = inputsAsDay2Data.filter { validatePolicieWithPosition(it.range, it.character, it.password) }

        return Pair(inputFilteredWithRange.size, inputFilteredWithPosition.size)
    }
}