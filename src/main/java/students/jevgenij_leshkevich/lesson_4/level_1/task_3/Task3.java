package students.jevgenij_leshkevich.lesson_4.level_1.task_3;

class Task3 {

    public static void main(String[] args) {
        System.out.print("Введите целое число: ");
        java.util.Scanner scannerA = new java.util.Scanner(System.in);
        int aNumber = scannerA.nextInt();
        int remainder = aNumber % 2;
        if (remainder==0) { System.out.println("Это четное число.");
        } else { System.out.println("Это нечетное число.");
        }
    }
}