package students.dmitriy_shukailo.lesson_2.level_2.task_8;

class HelloUserName {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Please, enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name + "!" );
    }

}
