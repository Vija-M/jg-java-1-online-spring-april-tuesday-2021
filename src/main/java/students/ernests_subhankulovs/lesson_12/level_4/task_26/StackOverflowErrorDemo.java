package students.ernests_subhankulovs.lesson_12.level_4.task_26;

class StackOverflowErrorDemo {
    public static void main(String[] args) {
        initiateRecursion(2);
    }

    static int initiateRecursion(int a) {
        System.out.println("a = " + a);
        return a * initiateRecursion(a + 1);
    }
}
