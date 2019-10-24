import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMarryCandy {
    @Test
    public void testCandies() {

        int array[] = new int[]{3, 4, 7, 7, 6, 6};
        int array2[] = new int[]{ 80, 80, 100000, 80, 80, 1000, 80, 80, 80, 80};
        int array3[] = new int[]{ 80, 90, 100000, 80, 80, 1000, 80, 80, 80, 80};
        int array4[] = new int[]{ 80, 80, 100000, 80, 80, 80, 80, 80, 80, 80};

        MarryCandy marryCandy = new MarryCandy();
        assertEquals(3, marryCandy.Solution(array));
        assertEquals(3, marryCandy.Solution(array2));
        assertEquals(4, marryCandy.Solution(array3));
        assertEquals(2, marryCandy.Solution(array4));



    }

}
