package students.olga_t.lesson_2.level_3.task_11;

class Average {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Введите первое число:");
        double InputNumber1 = scanner.nextDouble();
        System.out.println("Введите второе число:");
        double InputNumber2 = scanner.nextDouble();
        System.out.println("Введите третье число:");
        double InputNumber3 = scanner.nextDouble();
        double result = (InputNumber1 + InputNumber2 + InputNumber3) / 3;
        System.out.println("Среднее арифметическое трёх чисел составляет: " + result );
    }
}
