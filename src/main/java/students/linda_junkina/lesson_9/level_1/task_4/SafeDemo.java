package students.linda_junkina.lesson_9.level_1.task_4;

class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe("1234", 25);
        if (safe.pin.equals("1234")) {
            System.out.println("You have " + safe.amountOfMoney + "$");
        } else {
            System.out.println("Incorrect password. Try again.");
        }
    }
}
