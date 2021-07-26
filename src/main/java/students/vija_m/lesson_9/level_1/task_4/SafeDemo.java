package students.vija_m.lesson_9.level_1.task_4;


class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe(1234, 8.67);
        System.out.println("Pin code of this safe is: " + safe.pinCode + ". You can open it and take only " + safe.moneyAmount + " EUR.");
        safe.pinCode = 1111;
        safe.moneyAmount = 9875068.67;
        System.out.println("Now pin code of this safe is: " + safe.pinCode + ". You can open it and take " + safe.moneyAmount + " EUR.");
    }

}
