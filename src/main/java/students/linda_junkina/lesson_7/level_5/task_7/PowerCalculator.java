package students.linda_junkina.lesson_7.level_5.task_7;

class PowerCalculator {
    int raisedToPower(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        return result;
    }
}
