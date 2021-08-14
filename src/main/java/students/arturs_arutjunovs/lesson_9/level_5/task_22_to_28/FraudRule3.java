package students.arturs_arutjunovs.lesson_9.level_5.task_22_to_28;

public class FraudRule3 extends FraudRule {

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        return trader.getCity().equals("Sydney");
    }
}
