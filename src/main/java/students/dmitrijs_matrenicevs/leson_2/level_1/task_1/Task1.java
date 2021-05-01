package students.dmitrijs_matrenicevs.leson_2.level_1.task_1;

class Task1 {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter any 2 numbers: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a + b;
        int d = a - b;
        int f = a * b;
        int g = a / b;

        System.out.println("Plus:" + /*"a + b"*/ " = " + c);
        System.out.println("Minus:" + /*"a - b"*/ " = " + d);
        System.out.println("Multiply:" + /*"a * b"*/ " = " + f);
        System.out.println("Share:" + /*"a / b"*/ " = " + g);

    }
}
