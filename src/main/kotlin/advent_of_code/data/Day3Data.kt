package advent_of_code.data

class Day3Data(private val char: Char) {

    companion object {
        const val OPEN_SQUARE = '.'
        const val TREE = '#'
    }

    fun isTree(): Boolean = char == TREE
    fun isOpen(): Boolean = char == OPEN_SQUARE
}
