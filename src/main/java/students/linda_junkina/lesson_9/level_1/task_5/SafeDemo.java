package students.linda_junkina.lesson_9.level_1.task_5;

class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe("1234", 100);

        safe.getMoney("9876", 100);
        System.out.println();
        safe.getMoney("1234", 150);
        System.out.println();
        safe.getMoney("1234", 70);
        System.out.println();
        System.out.println();
        safe.putMoney("1234", 300);
        System.out.println();
        safe.putMoney("9876", 100);
    }
}
