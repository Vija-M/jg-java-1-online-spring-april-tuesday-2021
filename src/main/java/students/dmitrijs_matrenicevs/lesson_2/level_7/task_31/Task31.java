package students.dmitrijs_matrenicevs.lesson_2.level_7.task_31;

class Task31 {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        //Твоё имя
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        //Твой возраст
        System.out.print("Enter your age: ");
        String yourAge = scanner.nextLine();
        /*
        Твоё имя и твой возраст вместе
         */
        System.out.println("Your name is " + name + " and your age is " + yourAge);

    }

}
