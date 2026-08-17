fun main() {
    val greeting = birthdayGreeting(age = 5/* 인수 */)
    println(greeting)
    println(birthdayGreeting(age = 2, name = "Rex"))
}

fun birthdayGreeting(name: String = "Rover"/* 매개변수 */, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"

    return "$nameGreeting\n$ageGreeting"
}