package students.ernests_subhankulovs.lesson_6.level_4.task_20;

class WhileLoopContinue {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10) {
            i++;
            if (i % 2 == 0) {
                System.out.println("The next iteration will be skipped if the number is even.");
                continue;
            }
            System.out.println(i);
        }
    }
}
