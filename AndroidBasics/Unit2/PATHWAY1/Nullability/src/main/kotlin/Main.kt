fun main() {
    var favoriteActor: String? = "sandra Oh" // null을 허용하는 변수는 타입뒤에 물음표를 붙여아 한다.
    println(favoriteActor)
    favoriteActor = null
    println(favoriteActor)

    var favoriteActor2: String = "Sandra Oh"
    println(favoriteActor2.length)

    println(favoriteActor?.length) // ?. 은 nullable 변수의 메소드나 속성에 접근할떄 사용한다. 만약 변수가 null이면 그대로 null을 반환한다
    println(favoriteActor!!.length) // 변수가 null이면 nullpointerexception이 발생

    if (favoriteActor != null) { // if문으로 null 검사를 하면 그 안에서는 null검사를 하지 않고 그냥 사용할 수 있다
        println("The number of characters in your favorite actor's name is ${favoriteActor.length}.")
    }

    val lengthOfName = if (favoriteActor != null) favoriteActor.length else 0

    println("The number of characters in your favorite actor's name is $lengthOfName.")

    val lengthOfName2 = favoriteActor?.length ?: 0 // 엘비스 연산자를 사용하면 변수가 null일 때 디폴트값을 지정해줄수있다.
}