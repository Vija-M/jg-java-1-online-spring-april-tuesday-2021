package students.eriks_jaloveckis.lesson_9.level_1.task_5;

public class SafeDemo {
    public static void main(String[] args) {
        Safe safe1 = new Safe(1234, 500.00);
        safe1.getMoney(1234,400.00);
        safe1.putMoney(1234, 300.00);
        safe1.getMoney(1234, 500.00);
        safe1.putMoney(12345, 200.00);
    }
}
