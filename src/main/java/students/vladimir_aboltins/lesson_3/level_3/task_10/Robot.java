package students.vladimir_aboltins.lesson_3.level_3.task_10;

class Robot {

    String robotName;

    public static void printAskName(int number){
        System.out.println("\nRobot Nr. "+ number +"\nHello creator, what is my name?");
    }

    public void sayYourName() {
        System.out.println("Thank you creator, my name is " + robotName);
    }
}
