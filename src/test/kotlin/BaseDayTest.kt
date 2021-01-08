import advent_of_code.puzzle.BaseDay
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe

class BaseDayTest: AnnotationSpec() {

    class BaseDayInstance: BaseDay() {
        override fun solve(inputs: List<String>): Pair<Any, Any> {
            return Pair(1,1)
        }
    }

    var instance: BaseDay = BaseDayInstance()

    @BeforeEach
    fun beforeEach() {
        instance = BaseDayInstance()
    }


    @Test
    fun shouldCallSolveFunction() {
        instance.solvePuzzles(listOf("one", "two", "three")).shouldBe(Pair(1,1))
    }

}