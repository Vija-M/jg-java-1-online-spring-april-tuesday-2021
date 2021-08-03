package students.jevgenij_leshkevich.lesson_9.level_1.task_4;

class SafeDemo {

    public static void main(String[] args) {

        Safe safe = new Safe(1234, 999.99);
        System.out.println("== SAFE details before update ==");
        safe.showDetails();

        safe.pinCode = 7654;
        safe.cashAmount = 1555.55;
        System.out.println("== SAFE details after update ==");
        safe.showDetails();

    }
}
