package students.arturs_arutjunovs.lesson_9.level_5.task_22_to_28;

class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        return trader.getCountry().equals("Jamaica");
    }
}
