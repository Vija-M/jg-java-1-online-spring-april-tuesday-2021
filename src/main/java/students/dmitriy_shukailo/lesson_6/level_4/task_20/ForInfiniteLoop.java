package students.dmitriy_shukailo.lesson_6.level_4.task_20;

class ForInfiniteLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }

}