package students.arturs_arutjunovs.lesson_9.level_5.task_29;

class FraudRule1 extends FraudRule {

    public FraudRule1() {
        super("Rule #1");
    }

    boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        return trader.getFullName().equals("Pokemon");
    }
}
