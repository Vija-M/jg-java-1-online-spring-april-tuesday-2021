package students.jevgenij_leshkevich.lesson_2.level_3.task_11;

class Task11 {

    public static void main(String[] args) {
        System.out.print("Please enter value A (integer): ");
        java.util.Scanner scannerA = new java.util.Scanner(System.in);
        int aNumber = scannerA.nextInt();

        System.out.print("Please enter value B (integer): ");
        java.util.Scanner scannerB = new java.util.Scanner(System.in);
        int bNumber = scannerB.nextInt();

        System.out.print("Please enter value C (integer): ");
        java.util.Scanner scannerC = new java.util.Scanner(System.in);
        int cNumber = scannerA.nextInt();

        double average= (aNumber + bNumber + cNumber)/(double)3;

        System.out.println();
        System.out.println("Average is " + average);



    }


}
