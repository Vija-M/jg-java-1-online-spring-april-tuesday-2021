package students.vija_m.lesson_2.level_7.task_31;

class Task31 {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        /* Напишите программу в которой нужно вводить с клавиатуры целые числа и считать их сумму,
        пока пользователь не введёт слово "ENTER".
        Вывести на экран полученную сумму и завершить программу.
        В программе необходимо использовать цикл while.
         */
                System.out.println("Please, enter integer numbers: ");
        int sum = 0; // так как изначачально цифры не были введены, то их сумма равна 0
        boolean isExit = false; // присваиваем переменной значение false
        while (!isExit) { //  соответственно пока !isExit - true наш цикл работает
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum = sum + number; // если введённое  численное значение, то оно прибавляется к сумме ранее введённых чисел.
            }
            else if (scanner.hasNextLine()) {
                String line = scanner.nextLine();
            if (line.equals("ENTER")) { // если введён текст и он является словом ENTER
                isExit = true; // присваиваем переменной значение true и цикл прерывается
            }}}
                System.out.println(sum); // программа выводит сумму чисел

    }}
