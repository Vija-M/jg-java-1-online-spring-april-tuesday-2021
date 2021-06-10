package students.ernests_subhankulovs.lesson_7.level_5.task_7;

class PowerCalculator {

    public double power(double base, double exponent) {
        double result = 1;
        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }
        return result;
    }
}
