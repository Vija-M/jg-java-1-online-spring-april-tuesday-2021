package instructor.lesson_5;

class ForDemo {

    public static void main(String[] args) {

//        for (int i = 0; i < 500; i++) {
//            System.out.println((i + 1) + ") Hello World");
//        }

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
