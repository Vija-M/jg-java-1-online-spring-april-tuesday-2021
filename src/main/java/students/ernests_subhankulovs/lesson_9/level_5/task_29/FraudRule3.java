package students.ernests_subhankulovs.lesson_9.level_5.task_29;

class FraudRule3 extends FraudRule {

    public FraudRule3() {
        super("Rule 3");
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        return (trader.getCity().equals("Sydney"));
    }

}
