package students.arturs_arutjunovs.lesson_12.level_4.task_26;

class StackOverflowErrorDemo {
    public static void main(String[] args) {
        recursion(1);
    }

    static int recursion(int x) {
        System.out.println(x);
        return x + recursion(x + 1);

    }
}