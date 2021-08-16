package students.arturs_arutjunovs.lesson_12.level_3.task_21;
//Класс TestException расширяет Exception и тем самым срабатывает блок  catch(TestException t)
//и выводит :
// Got the Test Exception
// Inside finally block

class TestException extends Exception { }

class Main {
    public static void main(String[] args) {

        try {
            throw new TestException();
        } catch(TestException t) {
            System.out.println("Got the Test Exception");
        } finally {
            System.out.println("Inside finally block ");
        }
    }
}
