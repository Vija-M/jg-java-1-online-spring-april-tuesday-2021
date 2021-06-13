package students.arturs_arutjunovs.lesson_7.level_5.task_7;

class PowerCalculator {

    public int power(int a, int b) {         //умножить a на себя b раз
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        return result;
    }
}
