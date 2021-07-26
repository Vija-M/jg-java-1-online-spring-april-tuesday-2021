package students.ernests_subhankulovs.lesson_9.level_6.task_31;

class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        return (trader.getCity().equals("Sydney"));
    }

}
