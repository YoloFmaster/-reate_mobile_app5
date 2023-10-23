import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class CircleTest {

    @Test
    fun centerOfCircle() {
        val expected = arrayListOf<Double>(5.0,5.0)
        val actual = Circle(5.0, 2.0, 2.0, 5.0, 8.0, 5.0).centerOfCircle()
        assertEquals(expected,actual)
    }
}