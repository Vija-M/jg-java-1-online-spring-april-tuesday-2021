package students.eriks_jaloveckis.lesson_6.level_4.task_18;

class InfiniteLoop {
    public static void main(String[] args) {
        boolean infiniteWhile = true;
        while (infiniteWhile) {
            System.out.println("InfiniteWhile");
        }
        for (; ; ) {
            System.out.println("InfiniteFor");
        }
    }
}
