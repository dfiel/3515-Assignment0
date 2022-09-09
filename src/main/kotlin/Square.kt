class Square(_name: String) : Shape(_name) {
    var length: Double = 0.0

    fun setDimensions(_length: Double){
        length = _length
    }

    override fun printDimensions() {
        println("$length x $length Square")
    }

    override fun getArea(): Double {
        return length*length
    }
}