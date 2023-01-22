package udemy.discount;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class DiscountApplierTest {

    private DiscountApplier applier;

    @Before
    public void setup() {
        applier = new DiscountApplier();
    }

    @Test
    public void discountForMacAndIphoneTogether() {
        Item mac = new Item("MACBOOK", 1, 100);
        Item iphone = new Item("IPHONE", 1, 50);

        Basket basket = new Basket(Arrays.asList(mac, iphone));

        applier.apply(basket);

        double expected = (100+50) * (1-0.15);
        Assert.assertEquals(expected, basket.getAmount(), 0.0001);
    }
}
