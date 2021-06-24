package students.dmitrijs_matrenicevs.lesson_9.level_1.task_4;

class SafeDemo {

    public static void main(String[] args) {
        Safe safe = new Safe(505050,5896);
        System.out.println("Money in safe: " + safe.money);
        System.out.println("Pin Code: " + safe.pin);
    }
}
