package students.linda_junkina.lesson_2.level_3.task_11;

class Task11 {


    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print(" Please, enter a number: ");
        int number1 = scanner.nextInt();

        System.out.print(" Please, enter another number: ");
        int number2 = scanner.nextInt();

        System.out.print(" Please, enter one more number: ");
        int number3 = scanner.nextInt();


        double arithmeticMean = ((double) number1 + number2 + number3) / 3;
        System.out.print(" Arithmetic mean = " + arithmeticMean);
    }
}