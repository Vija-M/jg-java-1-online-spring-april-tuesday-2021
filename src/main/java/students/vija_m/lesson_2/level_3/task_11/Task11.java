package students.vija_m.lesson_2.level_3.task_11;

class Task11 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Пожалуйста, введите три целых числа для вычисления их среднего арифметического: ");
        System.out.print("Введите Ваше первое число: ");
        double a = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();
        System.out.print("Введите третее число: ");
        double c = scanner.nextDouble();
        System.out.println("Среднее арифметическое чисел: " + (int)a + ", " + (int)b + " и " + (int)c + " равно " + ((a + b + c) / 3) + ".");


    }

}
