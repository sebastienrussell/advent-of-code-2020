package advent_of_code

import advent_of_code.data.Day3Data

class Day3: BaseDay() {

    fun generateGrid(inputs: List<String>): Map<Pair<Int, Int>, Day3Data> {
        val grid = mutableMapOf<Pair<Int, Int>, Day3Data>()

        for ((i, line) in inputs.withIndex()) {
            for ((j, character) in line.withIndex())
                grid[Pair(inputs.size - 1 - i, j)] = Day3Data(character) // en bas, a gauche c'est [1,0]
        }

        return grid
    }

    override fun solve(inputs: List<String>): Pair<Any, Any> {
        val grid = generateGrid(inputs)

        val treeCountsRight1Down1 = solvePuzzleOne(inputs, grid, 1, 1)
        val treeCountsRight3Down1 = solvePuzzleOne(inputs, grid, 3, 1)
        val treeCountsRight5Down1 = solvePuzzleOne(inputs, grid, 5, 1)
        val treeCountsRight7Down1 = solvePuzzleOne(inputs, grid, 7, 1)
        val treeCountsRight1Down2 = solvePuzzleOne(inputs, grid, 1, 2)

        val answerPuzzle2 = (treeCountsRight1Down1.toLong() // Long because we go above the max value of an Int
                * treeCountsRight3Down1
                * treeCountsRight5Down1
                * treeCountsRight7Down1
                * treeCountsRight1Down2)

        return Pair(
            treeCountsRight3Down1,
            answerPuzzle2
        )
    }

    private fun solvePuzzleOne(
        inputs: List<String>,
        grid: Map<Pair<Int, Int>, Day3Data>,
        rightMouvement: Int,
        downMouvement: Int
    ): Int {
        var currentPosition = Pair(inputs.size - 1, 0)
        var treeCounts = 0
        do {
            if (grid.get(currentPosition)!!.isTree())
                treeCounts++
            currentPosition = Pair(currentPosition.first - downMouvement, (currentPosition.second + rightMouvement) % inputs.get(0).length)
        } while (currentPosition.first >= 0)
        return treeCounts
    }

}
