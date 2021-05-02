package students.arturs_arutjunovs.lesson_2.level_7.task_29;

class CorrectDataTypes {
    public static void main(String[] args) {

        int numberOne = 10;
        double numberTwo = 20.0;

        System.out.println("Number 1 = " + numberOne);
        System.out.println("Number 2 = " + numberTwo);

        float sum = (float) (numberOne + numberTwo);  //приведение к float

        System.out.println("Sum = " + sum);
    }
}
