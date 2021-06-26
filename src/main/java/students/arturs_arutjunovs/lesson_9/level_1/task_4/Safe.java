package students.arturs_arutjunovs.lesson_9.level_1.task_4;

class Safe {

    public int pinCode;
    public int moneyAmount;
}

class safeDemo {
    public static void main(String[] args) {

        Safe safe = new Safe();

        safe.pinCode = 1234;
        safe.moneyAmount = 5000;

        safe.pinCode = 0000;
        safe.moneyAmount = 0;

        //можно легко и безприпятственно менять публичные значения
    }
}