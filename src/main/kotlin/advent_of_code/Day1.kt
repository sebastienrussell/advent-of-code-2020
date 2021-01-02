package advent_of_code

class Day1 : BaseDay() {

    companion object {
        private const val SUM_EQUAL_VALUE: Int = 2020
    }

    fun findPairOfIntEqualsTo(value: Int, inputs: List<Int>): Pair<Int, Int> {
        inputs.forEach { firstElement ->
            inputs.forEach { secondElement ->
                if (firstElement + secondElement == value)
                    return Pair(firstElement, secondElement)
            }
        }
        return Pair(0,0)
    }

    fun findTripleOfIntEqualsTo(value: Int, inputs: List<Int>): Triple<Int, Int, Int> {
        inputs.forEach { firstElement ->
            inputs.forEach { secondElement ->
                inputs.forEach { thirdElement ->
                    if (firstElement + secondElement + thirdElement == value)
                        return Triple(firstElement, secondElement, thirdElement)
                }
            }
        }
        return Triple(0, 0, 0)
    }

    override fun solve(inputs: List<String>): Pair<Any, Any> {
        val inputsAsInt = inputs.map { it.toInt() }
        val firstPuzzle = findPairOfIntEqualsTo(SUM_EQUAL_VALUE, inputsAsInt)
        val secondPuzzle = findTripleOfIntEqualsTo(SUM_EQUAL_VALUE, inputsAsInt)
        return Pair(
            firstPuzzle.first * firstPuzzle.second,
            secondPuzzle.first * secondPuzzle.second * secondPuzzle.third
        )
    }

}