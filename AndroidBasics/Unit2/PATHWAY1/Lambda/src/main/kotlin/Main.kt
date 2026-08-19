fun main() {
//    val trickFunction = ::trick // 변수에 함수 저장

//    val trickFunction = trick
//    trick()
//    trickFunction()
//    treat()

    val treatFunction = trickOrTreat(false)
    val trickFunction = trickOrTreat(true)
    treatFunction()
    trickFunction()
}

fun trickOrTreat(isTrick: Boolean): () -> Unit { // 함수의 리턴타입이 함수임
    if (isTrick) {
        return trick
    } else {
        return treat
    }
}

val trick = { // 람다함수
    println("No treats!")
}

val treat: () -> Unit = { // 함수의 타입을 명시적으로 지정해줌. "(매개변수 타입 목록) -> 반환타입"
    println("Have a treat!")
}