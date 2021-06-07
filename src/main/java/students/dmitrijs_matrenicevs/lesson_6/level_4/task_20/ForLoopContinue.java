package students.dmitrijs_matrenicevs.lesson_6.level_4.task_20;

class ForLoopContinue {

    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            if (i % 15 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
