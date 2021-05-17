package students.jevgenij_leshkevich.lesson_2.level_1;

class Task2 {

    public static void main(String[] args) {
        System.out.print("Please enter value A (fractional): ");
        java.util.Scanner scannerA = new java.util.Scanner(System.in);
        double aNumber = scannerA.nextDouble();

        System.out.print("Please enter value B (fractional): ");
        java.util.Scanner scannerB = new java.util.Scanner(System.in);
        double bNumber = scannerB.nextDouble();

        double sumResult= aNumber + bNumber;
        double deductResult= aNumber - bNumber;
        double multResult= aNumber * bNumber;
        double divResult= aNumber / bNumber;

        System.out.println();
        System.out.println("The result of addition " + aNumber + " + " + bNumber + " = " + sumResult);
        System.out.println("The result of subtraction " + aNumber + " - " + bNumber + " = " + deductResult);
        System.out.println("The result of multiplication " + aNumber + " x " + bNumber + " = " + multResult);
        System.out.println("The result of division " + aNumber + " / " + bNumber + " = " + divResult);

    }

}
