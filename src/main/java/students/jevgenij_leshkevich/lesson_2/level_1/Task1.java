package students.jevgenij_leshkevich.lesson_2.level_1;

class Task1 {
    public static void main(String[] args) {
        System.out.print("Please enter value A (integer): ");
        java.util.Scanner scannerA = new java.util.Scanner(System.in);
        int aNumber = scannerA.nextInt();

        System.out.print("Please enter value B (integer): ");
        java.util.Scanner scannerB = new java.util.Scanner(System.in);
        int bNumber = scannerB.nextInt();

        int sumResult= aNumber + bNumber;
        int deductResult= aNumber - bNumber;
        int multResult= aNumber * bNumber;
        double divResult= aNumber / (double) bNumber;

        System.out.println();
        System.out.println("The result of addition " + aNumber + " + " + bNumber + " = " + sumResult);
        System.out.println("The result of subtraction " + aNumber + " - " + bNumber + " = " + deductResult);
        System.out.println("The result of multiplication " + aNumber + " x " + bNumber + " = " + multResult);
        System.out.println("The result of division " + aNumber + " / " + bNumber + " = " + divResult);
    }

}
