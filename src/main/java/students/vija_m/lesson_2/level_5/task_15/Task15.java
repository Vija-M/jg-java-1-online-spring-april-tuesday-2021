package students.vija_m.lesson_2.level_5.task_15;

class Task15 {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Пожалуйста, введите Ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Пожалуйста, введите Ваш возраст: ");
        int age = scanner.nextInt();
        System.out.println("Задавая первый вопрос мы использовали метод print, поэтому после вопроса курсор остался в той же строке и Ваше имя появилось в той же строке, что и вопрос.");
        System.out.println("Задавая второй вопрос мы использовали метод println, поэтому после вопроса курсор педешёл на новую строчку и Ваш возраст появился в новой строке.");

    }

    }
