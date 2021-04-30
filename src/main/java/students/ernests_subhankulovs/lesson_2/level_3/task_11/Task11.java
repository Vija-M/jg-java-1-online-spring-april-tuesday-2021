package students.ernests_subhankulovs.lesson_2.level_3.task_11;

class Task11 {
    public static void main(String[] args) {
        int a, b, c;
        double arithmeticMean;
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter number A:");
        a = scanner.nextInt();
        System.out.println("Enter number B:");
        b = scanner.nextInt();
        System.out.println("Enter number C:");
        c = scanner.nextInt();

        arithmeticMean = ((double) a + (double) b + (double) c) / 3;
        System.out.println("Arithmetic mean is: (A + B + C) / 3 = (" + a + " + " + b + " + " + c + ") / 3 = " + arithmeticMean);
    }
}
