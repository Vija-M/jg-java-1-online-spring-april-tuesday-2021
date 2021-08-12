package students.arturs_arutjunovs.lesson_9.level_5.task_29;

class FraudRule2 extends FraudRule {

    public FraudRule2() {
        super("Rule #2");
    }

    boolean isFraud(Transaction t) {
        return t.getAmount() > 1000000;

    }
}
