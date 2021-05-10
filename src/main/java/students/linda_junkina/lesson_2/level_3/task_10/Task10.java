package students.linda_junkina.lesson_2.level_3.task_10;

class Task10 {
/*
    Test Data:
    Radius = 7.5

    Expected Output
    Perimeter is = 47.12388980384689
    Area is = 176.71458676442586

 */

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Please, enter a radius: ");
        double enteredRadius = scanner.nextDouble();

        double perimeter = (double) 2 * Math.PI * enteredRadius;
        System.out.println(" Perimeter = " + perimeter);

        double area = (double) Math.PI * (enteredRadius * enteredRadius);
        System.out.println(" Area = " + area);

    }


}
