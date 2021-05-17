package instructor.lesson_3;

class CalculatorDemo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int result = calculator.sum(2, 2);
        System.out.println(result);

        System.out.println(calculator.sum(5, 5));

        System.out.println("calculator.sqr(1) = " + calculator.sqr(1));
        System.out.println("calculator.sqr(2) = " + calculator.sqr(2));
        System.out.println("calculator.sqr(3) = " + calculator.sqr(3));
        System.out.println("calculator.sqr(4) = " + calculator.sqr(4));
        System.out.println("calculator.sqr(5) = " + calculator.sqr(5));
        System.out.println("calculator.sqr(6) = " + calculator.sqr(6));
        System.out.println("calculator.sqr(7) = " + calculator.sqr(7));
        System.out.println("calculator.sqr(8) = " + calculator.sqr(8));
        System.out.println("calculator.sqr(9) = " + calculator.sqr(9));
        System.out.println("calculator.sqr(10) = " + calculator.sqr(10));

    }
}
