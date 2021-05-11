package instructor.lesson_3;

class SquareDemo {

    public static void main(String[] args) {

        Square a = new Square(2);
        System.out.println("a.perimeter() = " + a.perimeter());
        System.out.println("a.area() = " + a.area());
        a.printInfo();

        Square b = new Square(5);
        System.out.println("b.perimeter() = " + b.perimeter());
        System.out.println("b.area() = " + b.area());
        b.printInfo();

    }
}
