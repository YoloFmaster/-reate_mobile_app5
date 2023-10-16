import kotlin.math.*

class Point(val x: Double, val y: Double) {
    // Рассточние от это 1 точки до заданной
    fun distanceTo(other: Point): Double {
        val dx = x - other.x
        val dy = y - other.y
        return sqrt(dx * dx + dy * dy)
    }
}

class Triangle() {
    fun calculateTriangleArea(a: Double, b: Double, c: Double): Double {
        val p = (a + b + c)/2
        val area = sqrt(p * (p - a) * (p - b) * (p - c))
        val r = (a * b * c)/(4 * area)
        return abs(r)
    }
}

class Circle(){
    fun centerOfCircle(a: Point, b: Point, c: Point){
        val A = b.x - a.x
        val B = b.y - a.y
        val C = c.x - a.x
        val D = c.y - a.y
        val E = A * (a.x + b.x) + B * (b.y + a.y)
        val F = C * (a.x + c.x) + D * (c.y + a.y)
        val G = A * D - B * C
        val Cx = (D * E - B * F)/(2 * G)
        val Cy = (A * F - C * E)/(2 * G)
        println ("Координаты центра окружности: ($Cx;$Cy)")
    }
}