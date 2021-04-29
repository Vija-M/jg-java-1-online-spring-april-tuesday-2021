package students.arturs_arutjunovs.lesson_2.level_3.task_9;

class MultiplyTable {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Please enter single number: ");
        int number = scanner.nextInt();

        System.out.println(number + " * " + "1 = " + number * 1);
        System.out.println(number + " * " + "2 = " + number * 2);
        System.out.println(number + " * " + "3 = " + number * 3);
        System.out.println(number + " * " + "4 = " + number * 4);
        System.out.println(number + " * " + "5 = " + number * 5);
        System.out.println(number + " * " + "6 = " + number * 6);
        System.out.println(number + " * " + "7 = " + number * 7);
        System.out.println(number + " * " + "8 = " + number * 8);
        System.out.println(number + " * " + "9 = " + number * 9);
        System.out.println(number + " * " + "10 = " + number * 10);

        //можно для этого еще использовать цикл for, но это еще мы не проходили,
        // помню из недавно прочтенной книжки:-)
    }
}
