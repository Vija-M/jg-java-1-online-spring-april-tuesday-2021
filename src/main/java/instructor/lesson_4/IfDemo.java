package instructor.lesson_4;

class IfDemo {

    public static void main(String[] args) {

        boolean f1 = true;
        boolean f2 = false;
        boolean f3 = 1 == 1;

        if (f1) {
            System.out.println("f1"); // 1
        }

        if (f2) {
            System.out.println("f2"); // 2
        }

        if (1 < 5) {
            System.out.println("f3"); // 3
        }

    }
}
