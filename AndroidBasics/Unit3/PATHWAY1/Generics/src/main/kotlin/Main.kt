import Quiz.StudentProgress.answered
import Quiz.StudentProgress.total

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

interface ProgressPrintable {
    val progressText: String

    fun printProgressBar()
}

class Quiz : ProgressPrintable {

    override val progressText: String
        get() = "$answered of $total answered"

    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)

    override fun printProgressBar() {
        repeat(Quiz.answered) { print("*") }
        repeat(Quiz.total - Quiz.answered) { print("#") }
        println()
        println(progressText)
    }

    // 다른 클래스 내부에 싱글톤 객체를 만들때는 companion을 붙임
    // 아직은 어떤 장점이 있는지 모르겠음
    companion object StudentProgress { // 싱글톤 객체, class 대신 object 키워드 사용하면 됨
        var total: Int = 10
        var answered: Int = 3
    }

    fun printQuiz() {
        println(question1.questionText)
        println(question1.answer)
        println(question1.difficulty)
        println()
        println(question2.questionText)
        println(question2.answer)
        println(question2.difficulty)
        println()
        println(question3.questionText)
        println(question3.answer)
        println(question3.difficulty)
        println()

        // let()을 써서 위 코드를 아래 코드로 바꿀수 있다. 실제 이름대신 it으로 객체를 참조한다.

        question1.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question2.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
        question3.let {
            println(it.questionText)
            println(it.answer)
            println(it.difficulty)
        }
        println()
    }
}

//val Quiz.StudentProgress.progressText: String // 클래스의 속성인 것처럼 클래스의 속성을 클래스 외부에서 확장해서 선언할 수 있다. 이것이 확장 속성이다.
//    get() ="$answered of $total answered"

//object StudentProgress { // 싱글톤 객체, class 대신 object 키워드 사용하면 됨
//    var total: Int = 10
//    var answered: Int = 3
//}

//fun Quiz.StudentProgress.printProgressBar() { // 확장함수다. 마찬가지로 Quiz 클래스 밖에서 Quiz 클래스의 메서드인 것처럼 함수를 만들 수 있다.
//    repeat(Quiz.answered) { print("*") }
//    repeat(Quiz.total - Quiz.answered) { print("#") }
//    println()
//    println(Quiz.progressText)
//}

fun main() {
//    println("${StudentProgress.answered} of ${StudentProgress.total} answered.") // 싱글톤클래스의 데이터에 접근하는 방법
    println("${Quiz.answered} of ${Quiz.total} answered.") // companion 객체의 데이터에 접근할때는 StudentProgress가 아닌 Quiz를 참조하여 접근함


//    println(Quiz.progressText) // progressText는 Quiz 클래스 외부에서 선언됐지만 Quiz 클래스 안의 속성인 것처럼 호출할 수 있다. 확장속성은 데이터를 저장할 수 없어서 get only다.

//    Quiz.printProgressBar()

    Quiz().printProgressBar() // 이제 클래스 내의 메서드라서 Quiz를 생성하고 메서드를 호출해야 한다.

    val quiz = Quiz()
    quiz.printQuiz()

    Quiz().apply { // apply를 사용하면 Quiz 클래스의 인스턴스에서 바로 메서드를 호출할 수 있다
        printQuiz()
    }
}