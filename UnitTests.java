import org.junit.Test;
import static org.junit.Assert.assertEquals;

/** Test class for testing correctness of the manhattanDistance function
 *  with different pairs of points.
 *  @author Jonah Noh
 */

public class UnitTests {
    @Test
    public void testPair1() {
        Point pointA = new Point(5, 4);
        Point pointB = new Point(3, 2);
        Solution sol = new Solution();
        int dist = sol.manhattanDistance(pointA, pointB);

        assertEquals(4, dist);
    }

    @Test
    public void testPair2() {
        Point pointA = new Point(-1, 2);
        Point pointB = new Point(1, -2);
        Solution sol = new Solution();
        int dist = sol.manhattanDistance(pointA, pointB);

        assertEquals(6, dist);
    }

    @Test
    public void testPair3() {
        Point pointA = new Point(5, 2);
        Point pointB = new Point(-7, -9);
        Solution sol = new Solution();
        int dist = sol.manhattanDistance(pointA, pointB);

        assertEquals(23, dist);
    }
}
