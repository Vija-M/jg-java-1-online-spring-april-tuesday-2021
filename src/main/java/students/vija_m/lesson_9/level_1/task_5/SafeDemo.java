package students.vija_m.lesson_9.level_1.task_5;


class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe("AliBaBa", 100.01);
        safe.putMoney("HelloWorld", 10.00);
        safe.getMoney("HelloWorld", 10.00);
        safe.putMoney("AliBaBa", 10.02);
        safe.getMoney("AliBaBa", 10.03);
        safe.getMoney("AliBaBa", 110.03);
    }

}
