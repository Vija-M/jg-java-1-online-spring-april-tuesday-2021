package students.eriks_jaloveckis.lesson_9.level_4.task_20;

class FraudDetector {

    boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        if (trader.getFullName().equals("Pokemon")) {
            return true;
        }
        return false;
    }

    boolean amountFraud(Transaction t) {
        if (t.getAmount() > 1000000) {
            return true;
        }
        return false;
    }

    boolean cityFraud(Transaction t) {
        Trader trader = t.getTrader();
        if (trader.getCity().equals("Sidney")) {
            return true;
        }
        return false;
    }

    boolean jamaicaFraud(Transaction t) {
        Trader trader = t.getTrader();
        if (trader.getCountry().equals("Jamaica")) {
            return true;
        }
        return false;
    }
}

