package udemy.roman;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanNumeralTest {

    @Before
    public void setup() {
        RomanNumeral roman = new RomanNumeral();
    }
    
    // I = 1, V = 5, X = 10
    @Test
    public void aSingleNumber() {
        RomanNumeral roman = new RomanNumeral();

        Assert.assertEquals(1, roman.convert("I"));
        Assert.assertEquals(5, roman.convert("V"));
        Assert.assertEquals(10, roman.convert("X"));
        Assert.assertEquals(50, roman.convert("L"));
        Assert.assertEquals(100, roman.convert("C"));
    }

    @Test
    public void aComposedNumber() {
        RomanNumeral roman = new RomanNumeral();

        Assert.assertEquals(2, roman.convert("II"));
        Assert.assertEquals(6, roman.convert("VI"));
        Assert.assertEquals(16, roman.convert("XVI"));
        Assert.assertEquals(51, roman.convert("LI"));
    }

    @Test
    public void aComposedNumberWithRegression() {
        RomanNumeral roman = new RomanNumeral();

        Assert.assertEquals(4, roman.convert("IV"));
        Assert.assertEquals(9, roman.convert("IX"));
        Assert.assertEquals(14, roman.convert("XIV"));
        Assert.assertEquals(90, roman.convert("XC"));
    }
}
