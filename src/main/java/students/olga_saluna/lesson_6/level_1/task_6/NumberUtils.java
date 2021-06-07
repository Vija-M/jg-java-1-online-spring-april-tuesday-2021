package students.olga_saluna.lesson_6.level_1.task_6;

class NumberUtils {
    static boolean isEven(int number) {
        return (number % 2 == 0);
    }
    public static void main(String[] args) {
        System.out.println(isEven(99));
    }
}
