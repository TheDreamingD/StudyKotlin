fun main() {
    val count: Int = 2
    val count2 = 2 // 유형 추론, 데이터 타입을 지정하지 않아도 초기값을 보고 지정됨
    println("You have $count unread messages.")

    val unreadCount = 5
    val readCount = 100
    println("You have ${ unreadCount + readCount } total messages in your inbox.")

    var cartTotal = 0 // 변수값이 코드 중간에 변경되는 경우에는 val 대신 var를 사용
    cartTotal = 20
    println("Total: $cartTotal")

    var count3 = 10
    println("You have $count3 unread messages.")
    count3++
    println("You have $count3 unread messages.")
    count3--
    println("You have $count3 unread messages.")
}