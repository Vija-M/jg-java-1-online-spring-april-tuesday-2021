package students.olga_t.lesson_2.level_1.task_2;

class MyTask2Calculator {

        public static void main(String[] args) {


            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.println("Введите первое вещественное число:");
            double a = scanner.nextDouble();
            System.out.println("Введите второе вещественное число:");
            double b = scanner.nextDouble();


            System.out.println("Вы ввели цифры " + a + " и " + b +" . Результат вычислений смотрите ниже:"  );
            double sum = a + b;
            System.out.println("Сумма = " + sum);


            double sub = a - b;
            System.out.println("Разность = " + sub);


            double mul = a * b;
            System.out.println("Произведение = " + mul);


            double div = a / b;
            System.out.println("Деление = " + div);
        }
    }



