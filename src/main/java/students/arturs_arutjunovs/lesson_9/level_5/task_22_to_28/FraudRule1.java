package students.arturs_arutjunovs.lesson_9.level_5.task_22_to_28;

class FraudRule1 extends FraudRule {

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        return trader.getFullName().equals("Pokemon");
    }
}
