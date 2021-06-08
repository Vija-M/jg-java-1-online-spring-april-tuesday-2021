package students.arturs_arutjunovs.lesson_6.level_4.task_19;

class WhileInfiniteLoop {
    public static void main(String[] args) {

        int x = 1;
        while (x > 0) {
            x++;
            if (x == 10) {
                break;
            }
            System.out.println(x);
        }
    }
}
