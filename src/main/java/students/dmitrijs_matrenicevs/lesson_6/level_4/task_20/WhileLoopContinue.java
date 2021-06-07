package students.dmitrijs_matrenicevs.lesson_6.level_4.task_20;

class WhileLoopContinue {

    public static void main(String[] args) {

        int i = 0;
        while (i < 50) {
            i++;

            if (i % 2 == 0) {
                System.out.println("Shares!");
                continue;
            }
            System.out.println(i);
        }

    }

}
