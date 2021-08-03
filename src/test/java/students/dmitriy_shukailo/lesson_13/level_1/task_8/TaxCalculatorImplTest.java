package students.dmitriy_shukailo.lesson_13.level_1.task_8;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaxCalculatorImplTest {

    private TaxCalculator taxCalculator = new TaxCalculatorImpl();

    @Test
    public void shouldPayZeroTaxWhenIncomeIsZero() {
        var income = BigDecimal.ZERO;
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("0.00"));
    }

    @Test
    public void shouldPay25PercentTaxWhenIncomeLessThen20000() {
        var income = new BigDecimal(1);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("0.25"));
    }

    @Test
    public void shouldPay25PercentTaxWhenIncomeEqualTo20000() {
        var income = new BigDecimal(20000);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("5000.00"));
    }

    @Test
    public void shouldPay40PercentTaxWhenIncomeBiggerThen20000() {
        var income = new BigDecimal(40000);
        var taxToPay = taxCalculator.calculateTax(income);
        assertEquals(taxToPay, new BigDecimal("13000.00"));
    }

}