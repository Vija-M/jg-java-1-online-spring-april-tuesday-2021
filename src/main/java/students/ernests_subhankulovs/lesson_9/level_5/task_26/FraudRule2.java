package students.ernests_subhankulovs.lesson_9.level_5.task_26;

class FraudRule2 extends FraudRule {

    public FraudRule2(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return (t.getAmount() > 1000000);
    }

}
