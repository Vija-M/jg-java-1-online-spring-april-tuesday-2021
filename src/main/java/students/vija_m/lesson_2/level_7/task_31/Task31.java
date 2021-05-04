package students.vija_m.lesson_2.level_7.task_31;

class Task31 {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Please, enter integer numbers: ");
        int sum = 0; // так как изначачально цифры не были введены, то их сумма равна 0
        boolean isExit = false;
        while (!isExit) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum = sum + number;
            }
            /* программа проверяет введено ли число.
            если введённое значение число,
     то оно прибавляется к сумме ранее введённых чисел.
             */
            else if (scanner.hasNextLine()) {
                String line = scanner.nextLine();
            if (line.equals("ENTER")) { // если введён текст, то программа проверяет не является ли он ключевм словом "ENTER"
                isExit = true;
            }}}
                System.out.print(sum);

    }}
