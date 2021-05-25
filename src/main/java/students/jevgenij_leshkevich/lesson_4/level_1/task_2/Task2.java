package students.jevgenij_leshkevich.lesson_4.level_1.task_2;

class Task2 {

    public static void main(String[] args) {
        System.out.print("Введите целое число от 1 до 7: ");
        java.util.Scanner scannerA = new java.util.Scanner(System.in);
        int aNumber = scannerA.nextInt();

        switch (aNumber){
            case 1: System.out.println("Понедельник.");
                break;
            case 2: System.out.println("Вторник.");
                break;
            case 3: System.out.println("Среда.");
                break;
            case 4: System.out.println("Четверг.");
                break;
            case 5: System.out.println("Пятница.");
                break;
            case 6: System.out.println("Суббота.");
                break;
            case 7: System.out.println("Воскресенье.");
                break;
            default: System.out.println("Число не соответсвует запросу.");
        }

    }

}
