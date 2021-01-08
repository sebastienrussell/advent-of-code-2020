package advent_of_code.puzzle

import java.io.File

abstract class BaseDay {

    companion object {
        fun readFromFile(file: File): List<String> {
            return file.readLines()
        }

        fun readFromFilename(filename: String): List<String> {
            return readFromFile(File(filename))
        }
    }

    abstract fun solve(inputs: List<String>): Pair<Any, Any>

    fun solvePuzzles(inputs: List<String>): Pair<Any, Any> {
        return solve(inputs)
    }
}