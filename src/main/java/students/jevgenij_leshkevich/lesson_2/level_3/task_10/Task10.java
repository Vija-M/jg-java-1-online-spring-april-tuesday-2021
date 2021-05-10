package students.jevgenij_leshkevich.lesson_2.level_3.task_10;

class Task10 {


    public static void main(String[] args) {
        System.out.println("Please enter value (fractional) of radius: ");
        System.out.print("Radius = ");

        java.util.Scanner scannerA = new java.util.Scanner(System.in);
        double aNumber = scannerA.nextDouble();

        double perimeter= 2*Math.PI*aNumber;
        double area= Math.PI*Math.pow(aNumber, 2);

        System.out.println();
        System.out.println("Perimeter is " + perimeter);
        System.out.println("Area is " + area);

    }


}
