import advent_of_code.BaseDay
import advent_of_code.Day1
import advent_of_code.Day2
import advent_of_code.Day3

fun main() {
    val results = mapOf(
        Pair("01/12/2020", Day1().solvePuzzles(BaseDay.readFromFile("j1/inputs.txt"))),
        Pair("02/12/2020", Day2().solvePuzzles(BaseDay.readFromFile("j2/inputs.txt"))),
        Pair("03/12/2020", Day3().solvePuzzles(BaseDay.readFromFile("j3/inputs.txt")))
    )
    println(results)
}