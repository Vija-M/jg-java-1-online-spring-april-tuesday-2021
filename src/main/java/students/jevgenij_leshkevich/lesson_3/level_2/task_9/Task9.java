package students.jevgenij_leshkevich.lesson_3.level_2.task_9;

class Task9 {

    public static void main(String[] args) {
        System.out.print("Please enter your RoboName ( mozhno s probelami ha-ha ): ");
        java.util.Scanner scannerName = new java.util.Scanner(System.in);
        String nickName = scannerName.nextLine();
        System.out.println("Hello, " + nickName + "! I was missing you )");
    }
}