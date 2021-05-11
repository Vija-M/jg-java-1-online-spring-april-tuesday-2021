package students.dmitriy_shukailo.lesson_2.level_3.task_9;

public class MultiplicationTable {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Please, enter a number: ");
        int number = scanner.nextInt();
        int numberAndOne = number * 1;
        int numberAndTwo = number * 2;
        int numberAndThree = number * 3;
        int numberAndFour = number * 4;
        int numberAndFive = number * 5;
        int numberAndSix = number * 6;
        int numberAndSeven = number * 7;
        int numberAndEight = number * 8;
        int numberAndNine = number * 9;
        int numberAndTen = number * 10;

        System.out.println(number + " x 1 = " + numberAndOne);
        System.out.println(number + " x 2 = " + numberAndTwo);
        System.out.println(number + " x 3 = " + numberAndThree);
        System.out.println(number + " x 4 = " + numberAndFour);
        System.out.println(number + " x 5 = " + numberAndFive);
        System.out.println(number + " x 6 = " + numberAndSix);
        System.out.println(number + " x 7 = " + numberAndSeven);
        System.out.println(number + " x 8 = " + numberAndEight);
        System.out.println(number + " x 9 = " + numberAndNine);
        System.out.println(number + " x 10 = " + numberAndTen);

    }
}
