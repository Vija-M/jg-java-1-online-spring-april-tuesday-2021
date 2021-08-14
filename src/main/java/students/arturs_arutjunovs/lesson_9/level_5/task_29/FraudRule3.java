package students.arturs_arutjunovs.lesson_9.level_5.task_29;

public class FraudRule3 extends FraudRule {

    public FraudRule3() {
        super("Rule #3");
    }

    boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        return trader.getCity().equals("Sydney");
    }
}
