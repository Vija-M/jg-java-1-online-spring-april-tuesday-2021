package students.dmitrijs_matrenicevs.lesson_4.level_7.task_17;

class FizzBuzz {



    public String detect(int number) {


        if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else if (number % 15 == O) {
            return "FizzBuzz";
        } else {
            return "" + number;
        }

    }