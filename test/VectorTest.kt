import com.seng.add
import com.seng.sort
import org.junit.Test
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
}