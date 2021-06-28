package students.ernests_subhankulovs.lesson_9.level_5.task_29;

class FraudRule1 extends FraudRule {

    public FraudRule1() {
        super("Rule 1");
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        return (trader.getFullName().equals("Pokemon"));
    }

}
