package students.olga_saluna.lesson_2.level_3.task_10;

class Circle {
    public static void main(String[] args){
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Please enter circle radius (real number): ");

        double a = scanner.nextDouble();

        System.out.println("Perimeter is = " + (2*Math.PI*a));
        System.out.println("Area is = " + a*a*Math.PI);

    }
}
