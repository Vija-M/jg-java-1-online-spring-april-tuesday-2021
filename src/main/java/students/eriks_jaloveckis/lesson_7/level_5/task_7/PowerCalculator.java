package students.eriks_jaloveckis.lesson_7.level_5.task_7;

class PowerCalculator {
    public int createPowerCalculator(int number, int power) {
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }
        return result;
    }
}
