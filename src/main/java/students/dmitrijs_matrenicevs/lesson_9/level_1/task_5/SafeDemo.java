package students.dmitrijs_matrenicevs.lesson_9.level_1.task_5;

class SafeDemo {

    public static void main(String[] args) {
        Safe safe = new Safe(500,"222");
        System.out.println("У тебя в сейфе " + safe.money + "$");
        System.out.println("Твой пароль от сейфа: " + safe.password);
        System.out.println(safe.getMoney());
        System.out.println(safe.putMoney());
    }
}
