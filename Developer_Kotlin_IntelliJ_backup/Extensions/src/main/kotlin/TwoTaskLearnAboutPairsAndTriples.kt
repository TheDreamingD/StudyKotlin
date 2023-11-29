fun main(args: Array<String>) {
    val equipment = "fish net" to "catching fish"
    println("${ equipment.first } used for ${ equipment.second }")

    val numbers = Triple(6, 9, 42)
    println(numbers.toString())
    println(numbers.toList())

    val equipment2 = ("fish net" to "catching fish") to "equipment"
    println("${ equipment2.first } is ${ equipment2.second }\n")
    println("${ equipment2.first.second }")

    val (tool, use) = equipment
    println("$tool is used for $use")

    val (n1, n2, n3) = numbers
    println("$n1 $n2 $n3")
}