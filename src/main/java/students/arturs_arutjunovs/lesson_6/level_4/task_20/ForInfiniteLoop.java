package students.arturs_arutjunovs.lesson_6.level_4.task_20;

class ForInfiniteLoop {
    public static void main(String[] args) {

        for (int x = 0; x < 10; x++) {
            if (x == 5) {
                continue;
            }
            System.out.println(x);
        }
    }
}
