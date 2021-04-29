package students.olga_t.lesson_2.level_5.task_15;

class InputNumbers {
        public static void main(String[] args) {
            java.util.Scanner scanner = new java.util.Scanner(System.in);

            // Enter number and press Enter
            System.out.println("Введите целое число и нажмите Enter");
            int InputNumber = scanner.nextInt();

            System.out.println("Вы ввели число " + InputNumber + ". Ниже таблица умножения для этого числа до 10:");

            System.out.print(InputNumber + " * 1 = " + InputNumber * 1 +", ");
            System.out.print(InputNumber + " * 2 = " + InputNumber * 2 +", ");
            System.out.print(InputNumber + " * 3 = " + InputNumber * 3 +", ");
            System.out.print(InputNumber + " * 4 = " + InputNumber * 4 +", ");
            System.out.print(InputNumber + " * 5 = " + InputNumber * 5 +", ");
            System.out.print(InputNumber + " * 6 = " + InputNumber * 6 +", ");
            System.out.print(InputNumber + " * 7 = " + InputNumber * 7 +", ");
            System.out.print(InputNumber + " * 8 = " + InputNumber * 8 +", ");
            System.out.print(InputNumber + " * 9 = " + InputNumber * 9 +", ");
            System.out.print(InputNumber + " * 10 = " + InputNumber * 10 +". ");

        }


    }

