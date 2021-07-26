package students.dmitriy_shukailo.lesson_9.level_1.task_4;

class SafeDemo {

    public static void main(String[] args) {

        Safe safe = new Safe(1111, 1000);
        System.out.println("PIN code from safe : " + safe.pinCode);
        System.out.println("Amount money safe  : " + safe.amountMoney);

        safe.pinCode = 0000;
        safe.amountMoney = 0;
        System.out.println("PIN code from safe : " + safe.pinCode);
        System.out.println("Amount money safe  : " + safe.amountMoney);
    }

}