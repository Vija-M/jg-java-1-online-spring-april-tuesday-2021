package students.ernests_subhankulovs.lesson_12.level_3.task_20;

class MultiCatchExample {
    public static void main(String[] args) {
        try {

        }
        catch (ArithmeticException a) {

        }
        catch (Exception e) {

        }
        //In detail, in Java SE 7 and later, when you declare one or more exception types in
        //a catch clause, and rethrow the exception handled by this catch block, the compiler
        //verifies that the type of the rethrown exception meets the following conditions:
        //
        //The try block is able to throw it.
        //There are no other preceding catch blocks that can handle it.
        //It is a subtype or supertype of one of the catch clause's exception parameters.
        //The Java SE 7 compiler allows you to specify the exception types FirstException
        //and SecondException in the throws clause in the rethrowException method declaration
        //because you can rethrow an exception that is a supertype of any of the types declared in the throws.
    }
}
