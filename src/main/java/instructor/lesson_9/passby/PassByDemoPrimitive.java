package instructor.lesson_9.passby;

class PassByDemoPrimitive {

    // a) s1 - 10, s2 - 10
    // b) s1 - 10, s2 - 9
    // c) s1 - 9, s2 - 10
    // d) s1 - 9, s2 - 9

    public static void main(String[] args) {

        int x = 10;

        foo(x);

        System.out.println("s1 = " + x); // s1

    }

    static void foo(int x) {
        x = 9;
        System.out.println("s2 = " + x); // s2
    }
}
