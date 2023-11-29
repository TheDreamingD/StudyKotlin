package ten.example.myapp

sealed class TenSeal
class SeaLion : TenSeal()
class Walrus : TenSeal()

fun matchSeal(seal: TenSeal): String {
    return when (seal) {
        is Walrus -> "walrus"
        is SeaLion -> "sea lion"
    }
}