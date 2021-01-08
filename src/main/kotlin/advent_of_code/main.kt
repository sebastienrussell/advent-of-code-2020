import advent_of_code.puzzle.BaseDay
import advent_of_code.puzzle.Day1
import advent_of_code.puzzle.Day2
import advent_of_code.puzzle.Day3

const val DEFAULT_PATH = "./src/main/resources"

fun main() {
    val results = mapOf(
        Pair("01/12/2020", Day1().solvePuzzles(BaseDay.readFromFilename("$DEFAULT_PATH/j1/inputs.txt"))),
        Pair("02/12/2020", Day2().solvePuzzles(BaseDay.readFromFilename("$DEFAULT_PATH/j2/inputs.txt"))),
        Pair("03/12/2020", Day3().solvePuzzles(BaseDay.readFromFilename("$DEFAULT_PATH/j3/inputs.txt"))),
    )

    println(results)
}