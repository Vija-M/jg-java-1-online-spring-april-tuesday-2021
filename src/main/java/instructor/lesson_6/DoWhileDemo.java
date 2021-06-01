package instructor.lesson_6;

class DoWhileDemo {

    public static void main(String[] args) {

        System.out.println("Before");

        int foo = 0;

        while (1 == foo) {
            System.out.println("LOOP WHILE");
        }

        do {
            System.out.println("LOOP DO WHILE");
        } while (1 == foo);

        System.out.println("After");

//        int i = 0;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i < 5);

    }
}
