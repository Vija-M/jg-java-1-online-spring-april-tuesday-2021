package students.ernests_subhankulovs.lesson_9.level_5.task_29;

class FraudRule4 extends FraudRule {

    public FraudRule4() {
        super("Rule 4");
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        return (trader.getCountry().equals("Jamaica"));
    }

}
