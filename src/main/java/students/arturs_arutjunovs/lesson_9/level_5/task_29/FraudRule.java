package students.arturs_arutjunovs.lesson_9.level_5.task_29;

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    abstract boolean isFraud(Transaction t);
}
