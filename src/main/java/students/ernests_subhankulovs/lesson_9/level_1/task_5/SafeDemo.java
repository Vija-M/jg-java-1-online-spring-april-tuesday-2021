package students.ernests_subhankulovs.lesson_9.level_1.task_5;

class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe("1234", 150.00);
        System.out.println("Money amount before modification: " + safe.getMoney());
        System.out.println("After entering a wrong password:");
        safe.retrieveMoney("1235", 100.00);
        System.out.println("After entering the correct password:");
        safe.retrieveMoney("1234", 100.00);
        System.out.println("Money amount after taking 100.00 from the safe: " + safe.getMoney());
        System.out.println("After entering a wrong password:");
        safe.putMoney("1235", 200.00);
        System.out.println("After entering the correct password:");
        safe.putMoney("1234", 200.00);
        System.out.println("Money amount after putting 200.00 to the safe: " + safe.getMoney());
    }
}
