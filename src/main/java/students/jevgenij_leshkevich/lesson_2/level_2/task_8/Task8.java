package students.jevgenij_leshkevich.lesson_2.level_2.task_8;

class Task8 {

    public static void main(String[] args) {
        System.out.print("Please enter your Username: ");
        java.util.Scanner scannerU = new java.util.Scanner(System.in);
        String userName = scannerU.next();

        System.out.println();
        System.out.println("Hello, " + userName + " !");
    }

}
