import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.math.sqrt
class TriangleTest {

    @Test
    fun calculateTriangleArea() {
        val expected = 3.0
        val a = sqrt((5.0 -2.0) * (5.0 -2.0) + (2.0 - 5.0) * (2.0 - 5.0))
        val b = sqrt((8.0 -2.0) * (8.0 -2.0) + (6.0 - 5.0) * (6.0 - 5.0))
        val c = sqrt((8.0 - 5.0) * (8.0 - 5.0) + (6.0 -2.0) * (6.0 -2.0))
        val actual = Triangle(a, b, c).calculateTriangleArea()
        assertEquals(expected, actual)
    }
}