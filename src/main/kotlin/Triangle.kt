import kotlin.math.sqrt

open class Triangle(_name: String) : Shape(_name) {
    var sideA: Double = 0.0
    var sideB: Double = 0.0
    var sideC: Double = 0.0

    fun setDimensions(_a: Double, _b: Double, _c: Double){
        sideA = _a
        sideB = _b
        sideC = _c
    }

    override fun printDimensions() {
        println("Triangle with Sides A: $sideA B: $sideB C: $sideC")
    }

    override fun getArea(): Double {
        val s = (sideA+sideB+sideC)/2
        return sqrt(s*(s-sideA)*(s-sideB)*(s-sideC))
    }
}