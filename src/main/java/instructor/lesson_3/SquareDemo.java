package instructor.lesson_3;

class SquareDemo {

    public static void main(String[] args) {

        MySquare a = new MySquare(2);
        System.out.println("a.perimeter() = " + a.perimeter());
        System.out.println("a.area() = " + a.area());
        a.printInfo();

        MySquare b = new MySquare(5);
        System.out.println("b.perimeter() = " + b.perimeter());
        System.out.println("b.area() = " + b.area());
        b.printInfo();

    }
}
