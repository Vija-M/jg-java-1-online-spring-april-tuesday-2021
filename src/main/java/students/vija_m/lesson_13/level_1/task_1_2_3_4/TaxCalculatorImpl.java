package students.vija_m.lesson_13.level_1.task_1_2_3_4;

import java.math.BigDecimal;

class TaxCalculatorImpl implements TaxCalculator {
    @Override
    public BigDecimal calculateTax(BigDecimal income) {
                   return income.multiply(new BigDecimal("0.25"));

        }
    }

