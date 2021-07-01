package students.olga_saluna.lesson_9.level_1.task_4;

class SafeDemo {

    public static void main(String[] args) {
        Safe safe = new Safe(1212, 3333.33);
        System.out.println(safe.pin + "<- this is your pin code ");
        System.out.println(safe.moneyAmount + "<- this is available money amount.");

    }
}