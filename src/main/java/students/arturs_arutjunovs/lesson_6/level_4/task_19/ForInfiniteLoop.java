package students.arturs_arutjunovs.lesson_6.level_4.task_19;

class ForInfiniteLoop {
    public static void main(String[] args) {

        for (int x = 1; x > 0; x++) {
            if (x == 5) {
                break;
            }
            System.out.println(x);
        }
    }
}
