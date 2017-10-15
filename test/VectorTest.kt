import com.seng.*
import org.junit.Test
import org.junit.Assert.assertEquals
import org.junit.Assert.assertArrayEquals

class VectorTest {
    @Test fun testSort() {
        assertArrayEquals(
                arrayOf(1, 2, 3, 4, 5),
                arrayOf(2, 4, 5, 3, 1).sort()
        )
    }

    @Test fun testAdd() {
        assertArrayEquals(
                arrayOf(2, 4, 6, 8, 10),
                arrayOf(1, 1, 1, 1, 1).add(arrayOf(1, 3, 5, 7, 9))
        )
    }

    @Test fun testInvert() {
        assertArrayEquals(
                arrayOf(5, 4, 3, 2, 1),
                arrayOf(1, 2, 3, 4, 5).invert()
        )
    }

    @Test fun testMinMaxNormal() {
        assertEquals(
                Pair(1, 10),
                arrayOf(3, 5, 1, 8, 10).getMinMax()
        )
    }

    @Test fun testMinMaxEmpty() {
        assertEquals(
                Pair(null, null),
                arrayOf<Int>().getMinMax()
        )
    }

    @Test fun testMinMaxOne() {
        assertEquals(
                Pair(10, 10),
                arrayOf(10).getMinMax()
        )
    }

    @Test fun testApply() {
        val result = arrayOf(1, 2, 3, 4, 5).apply { it*2 }
        assertArrayEquals(
                arrayOf(2, 4, 6, 8, 10),
                result
        )
    }
}