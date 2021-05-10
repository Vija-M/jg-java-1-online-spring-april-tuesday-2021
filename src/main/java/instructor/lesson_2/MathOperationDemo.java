package instructor.lesson_2;

public class MathOperationDemo {

    public static void main(String[] args) {

        int a = 123;
        int b = 321;
        int c = a + b + 5;


        System.out.println("a + b + 5 = " + c);

        // 1
        System.out.println(a + " + " + b + " + 5 = " + c);

        // 2
        System.out.print(a);
        System.out.print(" + ");
        System.out.print(b);
        System.out.print(" + 5 = ");
        System.out.println(c);

        // 3
        System.out.println(a + " + " + b + " + 5 = " + (a + b + 5));

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

    }
}
