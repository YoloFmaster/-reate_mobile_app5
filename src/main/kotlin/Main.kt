import java.util.*
val scanner = Scanner(System.`in`)
fun main() {
    println("Задайте треугольник (3 точки через пробел в формате: Х У)")
    val triPoints = scanner.nextLine().split(" ").map { it.toDouble() }
    val A = Point(triPoints[0], triPoints[1])
    val B = Point(triPoints[2], triPoints[3])
    val C = Point(triPoints[4], triPoints[5])
    val AB = A.distanceTo(triPoints[2], triPoints[3])
    val BC = B.distanceTo(triPoints[4], triPoints[5])
    val AC = A.distanceTo(triPoints[4], triPoints[5])
    val triangle = Triangle().calculateTriangleArea(AB,BC,AC)
    println("Радиус окружности равен $triangle")
    val circle = Circle(A,B,C).centerOfCircle()
    println("$circle")
}