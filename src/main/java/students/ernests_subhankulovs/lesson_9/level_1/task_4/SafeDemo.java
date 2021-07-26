package students.ernests_subhankulovs.lesson_9.level_1.task_4;

class SafeDemo {
    public static void main(String[] args) {
        Safe safe = new Safe();
        safe.pinCode = "1234";
        safe.moneyAmount = 150.00;
        System.out.println("PIN code before modification: " + safe.pinCode);
        System.out.println("Money amount before modification: " + safe.moneyAmount);
        safe.pinCode = "4321";
        safe.moneyAmount = 50.00;
        System.out.println();
        System.out.println("PIN code after modification: " + safe.pinCode);
        System.out.println("Money amount after modification: " + safe.moneyAmount);
    }
}
