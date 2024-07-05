package six.example.myapp

import java.lang.Math.*

class SixTowerTank(override var height: Int, var diameter: Int) : SixAquarium(height = height, width = diameter, length = diameter) {
    override var volume: Int
        get() = (width / 2 * length / 2 * height / 1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width / 2 * length / 2)).toInt()
        }

    override var water = volume * 0.8

    override val shape = "cylinder"
}