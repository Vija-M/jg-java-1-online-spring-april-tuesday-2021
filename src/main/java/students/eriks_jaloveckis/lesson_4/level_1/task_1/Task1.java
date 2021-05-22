package students.eriks_jaloveckis.lesson_4.level_1.task_1;

    import java.util.Scanner;
    class Task1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите целое число: ");



            int number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Ваше число отрицательное!");
            }
            else if (number == 0){
                System.out.println("Ваше число равно нулю!");
            }
            else {
                System.out.println("Ваше число положительное!");
            }
        }
    }

