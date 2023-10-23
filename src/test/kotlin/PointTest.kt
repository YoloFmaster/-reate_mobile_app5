import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class PointTest {

    @Test
    fun distanceTo() {
        val expected = arrayListOf<Double>(4.24, 6.0, 5.0)
        val actual = Point(5.0, 2.0).distanceTo(2.0, 5.0)
        val actual2 = Point(2.0, 5.0).distanceTo(8.0, 6.0)
        val actual3 = Point(5.0, 2.0).distanceTo(8.0, 6.0)
        assertEquals(expected[0], actual, 0.01)
        assertEquals(expected[1], actual2, 0.1)
        assertEquals(expected[2], actual3, 0.01)
    }
}