package students.linda_junkina.lesson_13.level_1.task_1_2_3_4_5_6_7_8;

import java.math.BigDecimal;

class TaxCalculatorImpl implements TaxCalculator {
    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        if (income.compareTo(new BigDecimal("20000")) < 0) {
            return income.multiply(new BigDecimal("0.25"));
        } else {
            BigDecimal incomeBiggerThan20K = income.subtract(new BigDecimal("20000"));
            BigDecimal taxBefore20K = new BigDecimal("20000").multiply(new BigDecimal("0.25"));
            BigDecimal taxAfter20K = incomeBiggerThan20K.multiply(new BigDecimal("0.40"));
            return taxAfter20K.add(taxBefore20K);
        }
    }
}
