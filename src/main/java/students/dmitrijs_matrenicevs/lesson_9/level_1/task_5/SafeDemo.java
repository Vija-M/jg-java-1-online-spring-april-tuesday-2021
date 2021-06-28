package students.dmitrijs_matrenicevs.lesson_9.level_1.task_5;

class SafeDemo {

    public static void main(String[] args) {
        Safe safe = new Safe(500.00, "444");
        System.out.println("У тебя в сейфе " + safe.getMoney() + "$");
        System.out.println();
        System.out.println("Пароль был введен не правильно, и ты не смог забрать свои деньги!");
        safe.retMoney(450.00, "445");
        System.out.println("Пароль был введен правильно, и ты смог забрать свои деньги!");
        safe.retMoney(450.00, "444");
        System.out.println();
        System.out.println("Ты забрал из сейфа: " + safe.getMoney() + "$");
        System.out.println();
        System.out.println("Пароль был введен не правильно, и ты не смог положить свои деньги!");
        safe.putMoney(100.00, "445");
        System.out.println("Пароль был введен правильно, и ты смог положить свои деньги!");
        safe.putMoney(100.00, "444");
        System.out.println();
        System.out.println("Ты положил в сейф: " + safe.getMoney() + "$");
    }
}
