package five.example

data class FiveFish(var name: String)

fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}