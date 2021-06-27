package students.ernests_subhankulovs.lesson_9.level_4.task_21;

class FraudDetector {

    boolean isFraud(Transaction t) {
        if (isBlacklistedTrader(t)) {
            return true;
        }
        else if (amountExceedsLimit(t)) {
            return true;
        }
        else if (isBlacklistedCity(t)) {
            return true;
        }
        else if (isBlacklistedCountry(t)) {
            return true;
        }
        else return amountExceedsGermanLimit(t);
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

    boolean isBlacklistedCountry(Transaction t) {
        Trader trader = t.getTrader();
        return (trader.getCountry().equals("Jamaica"));
    }

    boolean amountExceedsGermanLimit(Transaction t) {
        Trader trader = t.getTrader();
        return (trader.getCountry().equals("Germany") && t.getAmount() > 1000);
    }
}