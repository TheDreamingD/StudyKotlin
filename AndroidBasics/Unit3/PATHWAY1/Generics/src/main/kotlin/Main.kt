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

class Quiz {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    // 다른 클래스 내부에 싱글톤 객체를 만들때는 companion을 붙임
    // 아직은 어떤 장점이 있는지 모르겠음
    companion object StudentProgress { // 싱글톤 객체, class 대신 object 키워드 사용하면 됨
        var total: Int = 10
        var answered: Int = 3
    }
}

//object StudentProgress { // 싱글톤 객체, class 대신 object 키워드 사용하면 됨
//    var total: Int = 10
//    var answered: Int = 3
//}

fun main() {
//    println("${StudentProgress.answered} of ${StudentProgress.total} answered.") // 싱글톤클래스의 데이터에 접근하는 방법
    println("${Quiz.answered} of ${Quiz.total} answered.") // companion 객체의 데이터에 접근할때는 StudentProgress가 아닌 Quiz를 참조하여 접근함
}