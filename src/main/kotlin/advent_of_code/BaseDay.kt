package advent_of_code

import java.io.File

abstract class BaseDay {

    companion object {
        fun readFromFile(fileName: String): List<String> {
            val lineOfFile = mutableListOf<String>()

            File("./src/main/resources/$fileName").forEachLine {
                lineOfFile.add(it)
            }

            return lineOfFile
        }
    }

    abstract fun solve(inputs: List<String>): Pair<Any, Any>

    fun solvePuzzles(inputs: List<String>): Pair<Any, Any> {
        return solve(inputs)
    }
}