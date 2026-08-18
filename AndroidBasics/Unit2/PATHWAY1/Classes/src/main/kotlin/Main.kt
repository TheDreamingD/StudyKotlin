class SmartDevice(val name: String, val category: String) { // 기본생성자는 헤더에 위치하고 본문을 가질 수 없음
    var deviceStatus = "online"

    /*
     * 보조생성자는 클래스 내에 위치하고 constructor로 시작하고, 기본생성자를 호출해주어야 한다.
     */
    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }

    fun turnOn() {
        println("Smart device is turned on.")
    }

    fun turnOff() {
        println("Smart device is turned off.")
    }
}

fun main() {
    val smartTvDevice = SmartDevice(name = "Android TV", category = "Entertainment")
    println("Device name is: ${smartTvDevice.name}")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}