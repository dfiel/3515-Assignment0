import kotlin.math.pow
import kotlin.math.PI

class Circle(_name: String) : Shape(_name) {
    var radius: Double = 0.0

    fun setDimensions(_radius: Double) {
        radius = _radius
    }

    override fun printDimensions() {
        println("$radius radius Circle")
    }

    override fun getArea(): Double {
        return PI*radius.pow(2)
    }
}