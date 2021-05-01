package students.dmitrijs_matrenicevs.lesson_2.level_3.task_11;

class Task11 {
    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Find out your average score, enter any 3 grades: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int sum = a + b + c;
        int result = sum / 3;

        System.out.println(/*"a + b + c = " + sum*/);
        System.out.println(/*sum + "/" + 3 +*/ "Result: = " + result);

    }
}
