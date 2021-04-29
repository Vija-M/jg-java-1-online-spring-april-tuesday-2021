package students.olga_t.lesson_2.level_3.task_9;

class InputNumber {
    public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Enter number and press Enter
        System.out.println("Введите целое число и нажмите Enter");
        int InputNumber = scanner.nextInt();

        System.out.println("Вы ввели число " + InputNumber + ". Ниже таблица умножения для этого числа до 10:");

        System.out.println(InputNumber + " * 1 = " + InputNumber * 1);
        System.out.println(InputNumber + " * 2 = " + InputNumber * 2);
        System.out.println(InputNumber + " * 3 = " + InputNumber * 3);
        System.out.println(InputNumber + " * 4 = " + InputNumber * 4);
        System.out.println(InputNumber + " * 5 = " + InputNumber * 5);
        System.out.println(InputNumber + " * 6 = " + InputNumber * 6);
        System.out.println(InputNumber + " * 7 = " + InputNumber * 7);
        System.out.println(InputNumber + " * 8 = " + InputNumber * 8);
        System.out.println(InputNumber + " * 9 = " + InputNumber * 9);
        System.out.println(InputNumber + " * 10 = " + InputNumber * 10);

    }


}
