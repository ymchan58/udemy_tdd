package udemy.invoice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class InvoiceFilterTest {

    private InvoiceFilter filter;
    private InvoiceRepository repo;

    @Before
    public void setup() {
        repo = Mockito.mock(InvoiceRepository.class);
        filter = new InvoiceFilter(repo);
    }

    @Test
    public void filterInvoicesHigherThan2000() {
        Invoice inv1 = new Invoice(Calendar.getInstance(), "YM", 5000);
        Invoice inv2 = new Invoice(Calendar.getInstance(), "YM", 200);

        Mockito.when(repo.all()).thenReturn(Arrays.asList(inv1, inv2));

        List<Invoice> res = filter.filter();

        Assert.assertEquals(1, res.size());
        Assert.assertEquals(inv1, res.get(0));
    }

    @Test
    public void filterMicrosoftInvoices() {
        Invoice inv1 = new Invoice(Calendar.getInstance(), "MICROSOFT", 1000);

        Mockito.when(repo.all()).thenReturn(Arrays.asList(inv1));

        List<Invoice> res = filter.filter();

        Assert.assertEquals(1, res.size());
        Assert.assertEquals(inv1, res.get(0));
    }

    @Test
    public void filterInvoicesBefore1999() {
        Calendar oldDate = Calendar.getInstance();
        oldDate.set(1995, Calendar.MAY, 22);

        Invoice inv1 = new Invoice(oldDate, "YM", 5000);
        Invoice inv2 = new Invoice(Calendar.getInstance(), "YM", 200);

        Mockito.when(repo.all()).thenReturn(Arrays.asList(inv1, inv2));

        List<Invoice> res = filter.filter();

        Assert.assertEquals(1, res.size());
        Assert.assertEquals(inv1, res.get(0));
    }
}
