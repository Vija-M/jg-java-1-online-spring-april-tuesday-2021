package students.ernests_subhankulovs.lesson_9.level_5.task_22;

public class Rule3FraudDetector extends FraudDetector  {
    @Override
    boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        return (trader.getCity().equals("Sydney"));
    }
}
