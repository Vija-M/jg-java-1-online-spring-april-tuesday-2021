package students.vija_m.lesson_6.level_4.task_20;

class WhileLoopContinue {
    public static void main(String[] args) {
        int i = 0;
        while (i < 6) {
            i++;
            if (i == 2 || i == 4 || i == 6) {
                System.out.println("Goodbye World!");
                continue;
            }
            System.out.println("Hello World!");
        }
    }
}

