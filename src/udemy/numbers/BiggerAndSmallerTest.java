package udemy.numbers;

import org.junit.Assert;
import org.junit.Test;

public class BiggerAndSmallerTest {
    @Test
    public void numbersInIncreasingOrder() {
        BiggerAndSmaller algo = new BiggerAndSmaller();

        algo.find(new int[] { 2, 3, 4 });

        Assert.assertEquals(4, algo.getBiggest());
        Assert.assertEquals(2, algo.getSmallest());
    }

    @Test
    public void numbersInDecreasingOrder() {
        BiggerAndSmaller algo = new BiggerAndSmaller();

        algo.find(new int[] { 4, 3, 2 });

        Assert.assertEquals(4, algo.getBiggest());
        Assert.assertEquals(2, algo.getSmallest());
    }

    @Test
    public void numbersInAnyOrder() {
        BiggerAndSmaller algo = new BiggerAndSmaller();

        algo.find(new int[] { 19, 5, 2, 17, 15, 10 });

        Assert.assertEquals(19, algo.getBiggest());
        Assert.assertEquals(2, algo.getSmallest());
    }

    @Test
    public void onlyOneNumber() {
        BiggerAndSmaller algo = new BiggerAndSmaller();

        algo.find(new int[] { 16 });

        Assert.assertEquals(16, algo.getBiggest());
        Assert.assertEquals(16, algo.getSmallest());
    }

    @Test
    public void repeatedNumbers() {
        BiggerAndSmaller algo = new BiggerAndSmaller();

        algo.find(new int[] { 16, 2, 16, 3, 4, 5, 15, 16 });

        Assert.assertEquals(16, algo.getBiggest());
        Assert.assertEquals(2, algo.getSmallest());
    }
}
