package students.ernests_subhankulovs.lesson_9.level_6.task_30;

class FraudDetector {

    FraudRule[] fraudRules;

    FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }

    boolean isFraud(Transaction t) {
        for (FraudRule rule : fraudRules) {
            if (rule.isFraud(t)) {
                return true;
            }
        }
        return false;
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