package students.ernests_subhankulovs.lesson_9.level_4.task_18;

class FraudDetector {

    boolean isFraud(Transaction t) {
        if (isBlacklistedTrader(t)) {
            return true;
        }
        else  {
            return amountExceedsLimit(t);
        }
    }

    boolean isBlacklistedTrader(Transaction t) {
        Trader trader = t.getTrader();
        return (trader.getFullName().equals("Pokemon"));
    }

    boolean amountExceedsLimit(Transaction t) {
        return (t.getAmount() > 1000000);
    }
}
