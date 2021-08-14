package students.arturs_arutjunovs.lesson_9.level_5.task_22_to_28;

public class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        return trader.getCountry().equals("Germany") && t.getAmount() > 1000;
    }
}
