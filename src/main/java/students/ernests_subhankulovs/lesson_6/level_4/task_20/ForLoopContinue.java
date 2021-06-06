package students.ernests_subhankulovs.lesson_6.level_4.task_20;

public class ForLoopContinue {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("The next iteration will be skipped if the number is even.");
                continue;
            }
            System.out.println(i);
        }
    }
}
