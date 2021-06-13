package students.dmitriy_shukailo.lesson_6.level_4.task_20;

class WhileInfiniteLoop {

    public static void main(String[] args) {

        int i = 0;
        while (i < 20) {
            i++;

            if (i % 3 == 0) {
                continue;
            }

            System.out.println("i = " + i);
        }
    }

}