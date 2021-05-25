package students.jevgenij_leshkevich.lesson_4.level_1.task_1;

class Task1 {

        public static void main(String[] args) {
            System.out.print("Введите целое число: ");
            java.util.Scanner scannerA = new java.util.Scanner(System.in);
            int aNumber = scannerA.nextInt();

            if (aNumber > 0) {
                System.out.println("Это положительное число.");
            } else if (aNumber < 0) {
                System.out.println("Это отрицательное число.");
            }       else {
                    System.out.println("Это нуль.");
                }

            }

        }
