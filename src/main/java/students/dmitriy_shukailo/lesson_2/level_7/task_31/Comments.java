package students.dmitriy_shukailo.lesson_2.level_7.task_31;

class Comments {

    public static void main(String[] args) {

// ввод однострочного комментария

        java.util.Scanner scannerOne = new java.util.Scanner(System.in);

        System.out.println("Enter single-line comments: ");
        String singleLineComments = scannerOne.nextLine();
        System.out.println("Your comments: " + singleLineComments);

/*
    ввод
    многострочного
    комментария
*/
        java.util.Scanner scannerTwo = new java.util.Scanner(System.in);

        System.out.println("Enter two-line comments: ");
        String singleLineComments1 = scannerTwo.nextLine();
        String singleLineComments2 = scannerTwo.nextLine();
        System.out.println("Your comments: " + singleLineComments1 + " " + singleLineComments2);
    }
}
