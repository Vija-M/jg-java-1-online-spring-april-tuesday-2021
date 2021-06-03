package students.jevgenij_leshkevich.lesson_5.level_2.task_11;

class Task11 {

    public static void main(String[] args) {

        int[] numbers = new int[3];

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Для массива из " + numbers.length + " чисел введите число " + (i + 1) + " : ");
            int arrNumber = scanner.nextInt();
            numbers[i] = arrNumber;
        }

        System.out.println();
        System.out.print("Содержимое массива: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + "  ");
        }
    }

}
