package ten.example.myapp

sealed class TenSeal
class TenSeaLion : TenSeal()
class TenWalrus : TenSeal()

fun matchSeal(seal: TenSeal): String {
    return when(seal) {
        is TenWalrus -> "walrus"
        is TenSeaLion -> "sea lion"
    }
}