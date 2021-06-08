package students.arturs_arutjunovs.lesson_6.level_4.task_20;

class WhileInfiniteLoop {
    public static void main(String[] args) {

        int x = 0;
        while (x < 10) {
            x++;
            if (x == 5) {
                continue;
            }
            System.out.println(x);
        }
    }
}
