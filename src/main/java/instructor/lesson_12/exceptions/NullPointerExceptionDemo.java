package instructor.lesson_12.exceptions;

class NullPointerExceptionDemo {

    public static void main(String[] args) {

        String s = null; //"Hello";
//        System.out.println(s.toUpperCase());
        toUpperCaseString(s);

    }

    static String toUpperCaseString(String str) {
        return str.toUpperCase();
    }
}
