package students.dmitrijs_matrenicevs.lesson_4.level_7.task_17;

class FizzBuzzTest {

    public static void main(String[] args) {

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();

        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.testReturn();

    }


    void fizzTest(){
        fizzBuzzTestFinal(1, "Fizz");
    }

    void buzzTest(){
        fizzBuzzTestFinal(2, "Buzz");
    }

    void fizzBuzzTest (){
        fizzBuzzTestFinal(3, "FizzBuss");
    }

    void testReturn(){
        fizzBuzzTestFinal(4, "Return test");
    }

void fizzBuzzTestFinal (int number, String expectedResult){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(number);
        if (realResult.equals(expectedResult)){
            System.out.println(number + expectedResult +  " = " + "OK");
        }
        else {
            System.out.println(number + expectedResult + " = " + "FAIL");
        }
}
}
