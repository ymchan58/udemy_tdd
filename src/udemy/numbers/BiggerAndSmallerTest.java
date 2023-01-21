package udemy.numbers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BiggerAndSmallerTest {
    private BiggerAndSmaller algo;

    @Before
    public void setup() {
        algo = new BiggerAndSmaller();
    }

    // example of a helper method
    private int[] nums(int... numbers) {
        return numbers;
    }

    private void assertBiggestAndSmallest(int biggest, int smallest) {
        Assert.assertEquals(biggest, algo.getBiggest());
        Assert.assertEquals(smallest, algo.getSmallest());
    }

    @Test
    public void numbersInIncreasingOrder() {
        algo.find(nums(2, 3, 4));
        assertBiggestAndSmallest(4,2);
    }

    @Test
    public void numbersInDecreasingOrder() {
        algo.find(nums(4, 3, 2));
        assertBiggestAndSmallest(4,2);
    }

    @Test
    public void numbersInAnyOrder() {
        algo.find(nums(19, 5, 2, 17, 15, 10));
        assertBiggestAndSmallest(19,2);
    }

    @Test
    public void onlyOneNumber() {
        algo.find(nums(16));
        assertBiggestAndSmallest(16,16);
    }

    @Test
    public void repeatedNumbers() {
        algo.find(nums(16, 2, 16, 3, 4, 5, 15, 16));
        assertBiggestAndSmallest(16,2);
    }
}
