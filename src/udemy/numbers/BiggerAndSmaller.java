package udemy.numbers;

public class BiggerAndSmaller {
    int biggest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;

    public void find(int[] numbers) {
        for (int n: numbers) {
            if(n < smallest) smallest = n;
            if(n > biggest) biggest = n;
        }
    }

    public int getBiggest() {
        return biggest;
    }

    public int getSmallest() {
        return smallest;
    }
}
