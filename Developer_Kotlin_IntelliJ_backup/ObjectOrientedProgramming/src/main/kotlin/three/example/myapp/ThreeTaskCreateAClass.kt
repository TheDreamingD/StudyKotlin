package three.example.myapp

fun main(args: Array<String>) {
    // Step 3: Create a main() function
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = ThreeAquarium()
    // Step 4: Add a method
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()
}