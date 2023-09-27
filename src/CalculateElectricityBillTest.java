import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculateElectricityBillTest {
    private CalculateElectricityBill calculator = new CalculateElectricityBill();

    @Test
    public void testT1_InvalidInput() {
        int units = -25;

        try {
            calculator.calculateBill(units);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Invalid", e.getMessage());
            throw e;
        }
    }

    @Test
    public void testT2() {
        int units = 25;

        double expectedBill = 43200.0;
        double actualBill = calculator.calculateBill(units);
        Assertions.assertEquals(expectedBill, actualBill, 0.01);
    }

    @Test
    public void testT3() {
        int units = 75;

        double expectedBill = 131050.0;
        double actualBill = calculator.calculateBill(units);
        Assertions.assertEquals(expectedBill, actualBill, 0.01);
    }

    @Test
    public void testT4() {
        int units = 150;

        double expectedBill = 279400.0;
        double actualBill = calculator.calculateBill(units);
        Assertions.assertEquals(expectedBill, actualBill, 0.01);
    }

    @Test
    public void testT5() {
        int units = 250;

        double expectedBill = 513700.0;
        double actualBill = calculator.calculateBill(units);
        Assertions.assertEquals(expectedBill, actualBill, 0.01);
    }

    @Test
    public void testT6() {
        int units = 350;

        double expectedBill = 790250.0;
        double actualBill = calculator.calculateBill(units);
        Assertions.assertEquals(expectedBill, actualBill, 0.01);
    }

    @Test
    public void testT7() {
        int units = 450;

        double expectedBill = 1086950.0;
        double actualBill = calculator.calculateBill(units);
        Assertions.assertEquals(expectedBill, actualBill, 0.01);
    }
}
