import com.kowalski.SalesManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesManagerTest {

SalesManager salesManager = new SalesManager(new long[]{3,5,12,34,65,48,37,9,26});

    @Test
    public void testConstructor() {
        SalesManager salesManager1 = new SalesManager(new long[]{3, 7, 9});
        Assertions.assertNotNull(salesManager1);
    }

    @Test
    public void testMaxFunction(){
        double res = salesManager.max();
        Assertions.assertEquals(65,res);
    }

    @Test
    public void testTrimFunction(){
        double res = salesManager.trim();
        Assertions.assertEquals(30,res);
    }

    @Test
    public void testTrimDivByZeroFunction() {
        SalesManager salesManager2 = new SalesManager(new long[]{1,1});
        Assertions.assertThrows(ArithmeticException.class, () ->  salesManager2.trim());
    }
}