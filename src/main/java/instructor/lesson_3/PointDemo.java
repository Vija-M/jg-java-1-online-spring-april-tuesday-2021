package instructor.lesson_3;

class PointDemo {

    public static void main(String[] args) {

        Point a = new Point(5, 3);
        a.printInfo();

        System.out.println("a.x = " + a.x);
        System.out.println("a.y = " + a.y);

        Point b = new Point(4, 2);
        b.printInfo();
//        b.x = 4;
//        b.y = 2;

        System.out.println("b.x = " + b.x);
        System.out.println("b.y = " + b.y);

        Point c = new Point(1, 1);
        c.printInfo();

    }
}
