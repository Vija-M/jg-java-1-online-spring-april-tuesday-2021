package students.ernests_subhankulovs.lesson_9.level_5.task_27;

abstract class FraudRule {
    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);
}
