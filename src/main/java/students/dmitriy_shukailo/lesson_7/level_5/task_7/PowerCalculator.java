package students.dmitriy_shukailo.lesson_7.level_5.task_7;

class PowerCalculator {
    int powerNumber(int number, int power) {

        int total = 1;
        for (int i = 1; i <= power; i++) {
            total *= number;
        }
        return total;
    }

}