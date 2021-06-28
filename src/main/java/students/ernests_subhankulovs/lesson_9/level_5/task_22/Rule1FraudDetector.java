package students.ernests_subhankulovs.lesson_9.level_5.task_22;

class Rule1FraudDetector extends FraudDetector {
    @Override
    boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        return (trader.getFullName().equals("Pokemon"));
    }
}