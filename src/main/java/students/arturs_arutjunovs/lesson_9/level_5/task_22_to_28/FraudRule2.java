package students.arturs_arutjunovs.lesson_9.level_5.task_22_to_28;

class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getAmount() > 1000000;

    }
}
