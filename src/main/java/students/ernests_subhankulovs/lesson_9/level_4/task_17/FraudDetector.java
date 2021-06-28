package students.ernests_subhankulovs.lesson_9.level_4.task_17;

class FraudDetector {

    boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        return (trader.getFullName().equals("Pokemon"));
    }
}
