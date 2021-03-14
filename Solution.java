import static org.junit.Assert.*;

/** Stores the solution for the Manhattan Distance problem.
 *  @author Jonah Noh
 */

public class Solution {

    /* Calculates the manhattan distance between two points pt1 and pt2. */
    public int manhattanDistance(Point pt1, Point pt2) {
        
        int horizontalDist = Math.abs(pt1.x - pt2.x);

        int verticalDist = Math.abs(pt1.y - pt2.y);

        int distance = horizontalDist + verticalDist;
        
        return distance;
    }

    /* Driver method for testing out manhattanDistance function on example pair of points. */
    public static void main(String[] args) {

        Point pointA = new Point(-1, 2);
        Point pointB = new Point(1, -2);
        Solution sol = new Solution();
        int dist = sol.manhattanDistance(pointA, pointB);

        System.out.println("Manhattan Distance between A and B is: " + dist);
    }
}