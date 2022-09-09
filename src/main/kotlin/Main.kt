import java.util.Scanner

fun main(args: Array<String>) {
    val square: Shape = Square("Square")
    val circle: Shape = Circle("Circle")
    val triangle: Shape = Triangle("Triangle")
    val equilateralTriangle: Shape = EquilateralTriangle("ETriangle")

    val reader = Scanner(System.`in`)

    println("Enter Square Side Length: ")
    (square as Square).setDimensions(reader.nextDouble())

    println("Enter Circle Radius: ")
    (circle as Circle).setDimensions(reader.nextDouble())

    println("Enter Triangle side lengths: ")
    println("Press \"Enter\" after each length")
    (triangle as Triangle).setDimensions(reader.nextDouble(), reader.nextDouble(), reader.nextDouble())

    println("Enter Equilateral Triangle side length: ")
    (equilateralTriangle as EquilateralTriangle).setDimensions(reader.nextDouble())

    println("-".repeat(25))

    for (shape in listOf(square, circle, triangle, equilateralTriangle)){
        println("Shape Name: ${shape.name}")
        shape.printDimensions()
        println("${shape.name} Area: ${shape.getArea()}")
        println()
    }
}