fun main() {
    // 배열
//    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
//    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune") // 꺽쇠로 데이터타입을 지정하지 않아도 된다.
//    val solarSystem = rockPlanets + gasPlanets // 배열을 더하기로 합칠 수 있다.
//
//    println(solarSystem[0])
//    println(solarSystem[1])
//    println(solarSystem[2])
//    println(solarSystem[3])
//    println(solarSystem[4])
//    println(solarSystem[5])
//    println(solarSystem[6])
//    println(solarSystem[7])
//
//    solarSystem[3] = "Little Earth"
//    println(solarSystem[3])
//
//    val newSolarSystem = arrayOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")
//    println(newSolarSystem[8])

    // 리스트
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.size)
    println(solarSystem[2])
    println(solarSystem.get(3))
    println(solarSystem.indexOf("Earth"))
    println(solarSystem.indexOf("Pluto")) // 일치하는 항목이 없으면 -1을 반환

    for (planet in solarSystem) {
        println(planet)
    }

    // 요소를 추가하고 삭제하려면 mutable list로 만들어야 한다.
    val solarSystem2 = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    solarSystem2.add("Pluto")
    solarSystem2.add(3, "Theia")
    solarSystem2[3] = "Future moon" // 요소의 값을 수정
    println(solarSystem2[3])
    println(solarSystem2[9])
    solarSystem2.removeAt(9)
    solarSystem2.remove("Future moon")
    println(solarSystem2.contains("Pluto"))
    println("Future moon" in solarSystem2)
}