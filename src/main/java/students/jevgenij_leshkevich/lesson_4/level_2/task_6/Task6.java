package students.jevgenij_leshkevich.lesson_4.level_2.task_6;

class Task6 {

    public static void main(String[] args) {
        System.out.print("Enter number A: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int aNumber = scanner.nextInt();

        System.out.print("Enter number B: ");
        int bNumber = scanner.nextInt();

        if (aNumber == bNumber) {
            System.out.println("Numbers are equals");
        } else System.out.println("Numbers are different");
    }

}
