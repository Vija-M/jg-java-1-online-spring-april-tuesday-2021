package students.eriks_jaloveckis.lesson_6.level_4.task_20;

class LoopContinue {
    public static void main(String[] args) {
        String textWhile = "Its work";
        int count = 0;
        while (count < 10) {
            count++;
            System.out.println(textWhile);
            if (count == 2) {
                System.out.println("Continue");
                continue;
            }
        }
        String textFor = "Hello";
        int countFor = 10;
        for (int i = 0; i < countFor; i++) {
            System.out.println(textFor);
            if (i == 1) {
                System.out.println("Stop");
                continue;
            }
        }
    }
}
