package students.ernests_subhankulovs.lesson_9.level_4.task_19;

class FraudDetector {

    boolean isFraud(Transaction t) {
        if (isBlacklistedTrader(t)) {
            return true;
        }
        else if (amountExceedsLimit(t)) {
            return true;
        }
        else {
            return isBlacklistedCity(t);
        }
    }

    boolean isBlacklistedTrader(Transaction t) {
        Trader trader = t.getTrader();
        return (trader.getFullName().equals("Pokemon"));
    }

    boolean amountExceedsLimit(Transaction t) {
        return (t.getAmount() > 1000000);
    }

    boolean isBlacklistedCity(Transaction t) {
        Trader trader = t.getTrader();
        return (trader.getCity().equals("Sydney"));
    }
}