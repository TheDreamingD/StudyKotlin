fun main() {
//    val trickFunction = ::trick // 변수에 함수 저장

//    val trickFunction = trick
//    trick()
//    trickFunction()
//    treat()

    val coins: (Int) -> String = { quantity ->
        "$quantity quarters" // return 키워드가 없고 함수의 마지막 표현식을 반환함
    }
    val cupcake: (Int) -> String = { // 함수의 입력이 Int가 있어도 매개변수를 따로 줄 필요가 없으면 매개변수는 생략해도 된다.
        "Have a cupcake!"
    }
    val treatFunction = trickOrTreat(false, coins)
    val trickFunction = trickOrTreat(true, null)
    treatFunction()
    trickFunction()
}

//fun trickOrTreat(isTrick: Boolean): () -> Unit { // 함수의 리턴타입이 함수임
//    if (isTrick) {
//        return trick
//    } else {
//        return treat
//    }
//}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit { // 함수 매개변수는 null을 허용하는 함수 타입이다.
    if (isTrick) {
        return trick
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        return treat
    }
}

val trick = { // 람다함수
    println("No treats!")
}

val treat: () -> Unit = { // 함수의 타입을 명시적으로 지정해줌. "(매개변수 타입 목록) -> 반환타입"
    println("Have a treat!")
}