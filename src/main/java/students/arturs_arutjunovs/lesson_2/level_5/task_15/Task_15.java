package students.arturs_arutjunovs.lesson_2.level_5.task_15;

class Task_15 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Введите первое слово: ");
        String word1 = scanner.nextLine();
        System.out.print("Введите второе слово: ");
        String word2 = scanner.next();

        System.out.println(word1);
        System.out.println(word2);

        System.out.print(word1);  //здесь можно видеть различия между
        System.out.print(word2);  //print и println, курсор остается в той же строке,
        //и в консоли выводятся два слова подряд
    }
}
