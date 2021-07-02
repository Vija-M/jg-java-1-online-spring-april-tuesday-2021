package students.eriks_jaloveckis.lesson_9.level_1.task_4;

public class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe();
        safe.pincode = 000;
        safe.money = 0.0;

        System.out.println(safe.pincode);
        System.out.println(safe.money);
    }
}
