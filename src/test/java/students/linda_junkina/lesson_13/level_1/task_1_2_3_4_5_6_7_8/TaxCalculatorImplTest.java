package students.linda_junkina.lesson_13.level_1.task_1_2_3_4_5_6_7_8;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorImplTest {
    private final TaxCalculatorImpl subject = new TaxCalculatorImpl();

    @Test
    void calculateTaxIfIncomeZero() {
        BigDecimal income = new BigDecimal("0");
        BigDecimal taxToPay = subject.calculateTax(income);
        assertEquals(new BigDecimal("0.00"), taxToPay);
    }

    @Test
    void calculateTaxIfIncome2000() {
        BigDecimal income = new BigDecimal("2000");
        BigDecimal taxToPay = subject.calculateTax(income);
        assertEquals(new BigDecimal("500.00"), taxToPay);
    }

    @Test
    void calculateTaxIfIncome20K() {
        BigDecimal income = new BigDecimal("20000");
        BigDecimal taxToPay = subject.calculateTax(income);
        assertEquals(new BigDecimal("5000.00"), taxToPay);
    }

    @Test
    void calculateTaxIfIncomeMoreThan20K() {
        BigDecimal income = new BigDecimal("30000");
        BigDecimal taxToPay = subject.calculateTax(income);
        assertEquals(new BigDecimal("9000.00"), taxToPay);
    }
}