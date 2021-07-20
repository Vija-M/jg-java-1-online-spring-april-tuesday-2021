package students.arturs_arutjunovs.lesson_12.level_1.task_4;

class MyException extends Exception {

    public MyException(String message) {
        super("Info about checked exception" + message);
    }

}