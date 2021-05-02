package students.arturs_arutjunovs.lesson_2.level_7.task_31;

class Task_31 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Введите сумму денег в наличии: ");
        int balanceSum = scanner.nextInt();
        System.out.print("Введите потраченную сумму: ");
        int spentSum = scanner.nextInt();

        int sumRemain = balanceSum - spentSum;
        System.out.println("У вас осталось " + sumRemain + " €");

        //Поделить остаток между тремя братьями (однострочный комментарий)
        int averageForBro = sumRemain / 3;

        String bro_1 = "Ваня", bro_2 = "Витя", bro_3 = "Вова";

        /* Ниже используется метод конкатенации
        строковых значений и так же используется
        вычисление остатка от деления с помощью знака % (многострочный комментарий)
         */
        System.out.println(bro_1 +"," + " " + bro_2 + " и " + bro_3 + " получили по " + averageForBro + " €");
        int savings = sumRemain % 3;
        System.out.println("Остаток от деления " + savings + " положили в копилку");
    }
}
