package students.jevgenij_leshkevich.lesson_2.level_3.task_9;

class Task9 {


    public static void main(String[] args) {
        System.out.print("Please input number (integer): ");
        java.util.Scanner scannerA = new java.util.Scanner(System.in);
        int aNumber = scannerA.nextInt();

        System.out.println();
        System.out.println("For number " + aNumber + " here is multiplication table from 1 to 10:");
        System.out.println(aNumber + " x 1 " + " = " + aNumber);
        System.out.println(aNumber + " x 2 " + " = " + aNumber*2);
        System.out.println(aNumber + " x 3 " + " = " + aNumber*3);
        System.out.println(aNumber + " x 4 " + " = " + aNumber*4);
        System.out.println(aNumber + " x 5 " + " = " + aNumber*5);
        System.out.println(aNumber + " x 6 " + " = " + aNumber*6);
        System.out.println(aNumber + " x 7 " + " = " + aNumber*7);
        System.out.println(aNumber + " x 8 " + " = " + aNumber*8);
        System.out.println(aNumber + " x 9 " + " = " + aNumber*9);
        System.out.println(aNumber + " x 10 " + " = " + aNumber*10);
    }


}
