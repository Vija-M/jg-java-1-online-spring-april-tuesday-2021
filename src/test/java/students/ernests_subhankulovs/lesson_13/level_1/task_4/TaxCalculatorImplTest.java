package students.ernests_subhankulovs.lesson_13.level_1.task_4;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaxCalculatorImplTest {
    private TaxCalculator taxCalculator = new TaxCalculatorImpl();

    @Test
    public void shouldPayZeroTaxWhenIncomeIsZero() {
        var income = BigDecimal.ZERO;
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(new BigDecimal("0"), taxToPay);
    }

    @Test
    public void shouldPay25PercentTaxWhenIncomeLessThen20000() {
        var income = new BigDecimal(10000);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(new BigDecimal("2500"), taxToPay);
    }

    @Test
    public void shouldPay25PercentTaxWhenIncomeEqualTo20000() {
        var income = new BigDecimal(20000);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(new BigDecimal("5000"), taxToPay);
    }
}
