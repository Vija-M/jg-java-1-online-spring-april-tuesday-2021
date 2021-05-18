package instructor.lesson_4;

class ComplexConditionalDemo {

    public static void main(String[] args) {

        boolean f1 = true;
        boolean f2 = false;

        System.out.println("f1 && f2 = " + (f1 && f2));
        System.out.println("f1 || f2 = " + (f1 || f2));
        System.out.println("(f1 && !f2) = " + (f1 && !f2));

        System.out.println("!!!f1 = " + !!!f1);

    }
}
