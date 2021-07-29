package students.ernests_subhankulovs.lesson_13.level_1.task_4;

import java.math.BigDecimal;

class TaxCalculatorImpl implements TaxCalculator {
    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        var borderIncome = new BigDecimal(20000);
        if (income.compareTo(borderIncome) <= 0) {
            return new BigDecimal(income.doubleValue() * 0.25);
        }
        return null;
    }
}
