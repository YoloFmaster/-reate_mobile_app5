import kotlin.math.*

class Point(val x: Double, val y: Double) {
    // Рассточние от это первой точки до заданной
    fun distanceTo(x2: Double,y2: Double): Double {
        val dx = x - x2
        val dy = y - y2
        return sqrt(dx * dx + dy * dy)
    }
}

class Triangle(val z: Double, val x: Double,val y: Double){
    fun calculateTriangleArea(a: Double = z, b: Double = x, c: Double = y): Double {
        //полупериметр
        val p = (a + b + c)/2
        //площадь
        val area = sqrt(p * (p - a) * (p - b) * (p - c))
        val r = (a * b * c)/(4 * area)
        val R = floor( r * 10.0) / 10.0
        return abs(R)
    }
}

class Circle(val z: Point,val x: Point,val y: Point){
    constructor(x1 :Double, y1 :Double, x2:Double, y2:Double, x3:Double, y3:Double): this(Point(x1,y1),Point(x2,y2),Point(x3,y3)){}
    //это уравние прямых, проходящих через середины отрезков, в алгебраической форме
    fun centerOfCircle(a: Point = z, b: Point = x, c: Point = y): ArrayList<Double> {
        val A = b.x - a.x
        val B = b.y - a.y
        val C = c.x - a.x
        val D = c.y - a.y
        val E = A * (a.x + b.x) + B * (b.y + a.y)
        val F = C * (a.x + c.x) + D * (c.y + a.y)
        val G = A * D - B * C
        val Cx = (D * E - B * F)/(2 * G)
        val Cy = (A * F - C * E)/(2 * G)
        val cx = floor( Cx * 10.0) / 10.0
        val cy = floor( Cy * 10.0) / 10.0
        println ("Координаты центра окружности: ($cx;$cy)")
        val actual = arrayListOf(cx,cy)
        return actual
    }
}