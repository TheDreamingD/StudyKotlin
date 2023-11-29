package three.example

fun main() {
    labels()
}

fun labels() {
    outerLoop@ for (i in 1..100) {
        print("$i ")
        for (j in 1..100) {
            if (j > 10) break@outerLoop
        }
    }
}