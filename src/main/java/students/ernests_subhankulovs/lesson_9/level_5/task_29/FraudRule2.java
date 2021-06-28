package students.ernests_subhankulovs.lesson_9.level_5.task_29;

class FraudRule2 extends FraudRule {

    public FraudRule2() {
        super("Rule 2");
    }

    public boolean isFraud(Transaction t) {
        return (t.getAmount() > 1000000);
    }

}
