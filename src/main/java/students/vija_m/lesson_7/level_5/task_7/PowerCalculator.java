package students.vija_m.lesson_7.level_5.task_7;

class PowerCalculator {
    double power(double base, double exponent) {
        double result = 1.00;
        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }
        return result;
    }
}

