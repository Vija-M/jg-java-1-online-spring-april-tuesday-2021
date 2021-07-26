package instructor.lesson_12.exceptions.check;

class CheckedExceptionDemo {

    public static void main(String[] args) {

        try {
            foo();
        } catch (MyException e) {
            e.printStackTrace();
        }

    }

    static void foo() throws MyException {
        throw new MyException();
    }
}
