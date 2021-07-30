package students.arturs_arutjunovs.lesson_13.level_1.task_4;

import java.math.BigDecimal;

class TaxCalculatorImpl implements TaxCalculator {

    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        if (income.compareTo(new BigDecimal("20000")) <= 0) {
            return income.multiply(new BigDecimal("0.25"));
        }
        return null;
    }
}