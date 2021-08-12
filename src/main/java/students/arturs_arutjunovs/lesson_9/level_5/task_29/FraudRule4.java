package students.arturs_arutjunovs.lesson_9.level_5.task_29;

public class FraudRule4 extends FraudRule {

    public FraudRule4() {
        super("Rule #4");
    }

    boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        return trader.getCountry().equals("Jamaica");
    }
}
