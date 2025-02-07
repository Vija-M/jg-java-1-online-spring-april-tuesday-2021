package students.ernests_subhankulovs.lesson_9.level_5.task_29;

class FraudRule5 extends FraudRule {

    public FraudRule5() {
        super("Rule 5");
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        return (trader.getCountry().equals("Germany") && t.getAmount() > 1000);
    }

}
