package students.vija_m.lesson_6.level_4.task_20;

class ForLoopContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            if (i == 1 || i == 3 || i == 5) {
                System.out.println("Goodbye World!");
                continue;
            }
            System.out.println("Hello World!");
        }
    }
}
