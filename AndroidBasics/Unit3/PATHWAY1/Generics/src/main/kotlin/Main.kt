// 각 클래스의 속성이 거의 같은데 클래스를 나누면 비효율적임
//class FillInTheBlankQuestion(
//    val questionText: String,
//    val answer: String,
//    val difficulty: String
//)
//
//class TrueOrFalseQuestion(
//    val questionText: String,
//    val answer: Boolean,
//    val difficulty: String
//)
//
//class NumericQuestion(
//    val questionText: String,
//    val answer: Int,
//    val difficulty: String
//)

// 데이터 클래스로 생성하면 toString, equals 등의 함수를 자동으로 만들어준다. 메서드가 없이 값만 있는 클래스를 데이터 클래스로 만들 수 있다.
data class Question<T>( // 제네릭 타입 T를 사용해 위 3개의 클래스를 하나로 만듦
    val questionText: String,
    val answer: T,
    val difficulty: Difficulty
)

enum class Difficulty { // 값 집합을 제한할 때 사용. 값을 대분자로 정의
    EASY, MEDIUM, HARD
}

fun main() {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
}