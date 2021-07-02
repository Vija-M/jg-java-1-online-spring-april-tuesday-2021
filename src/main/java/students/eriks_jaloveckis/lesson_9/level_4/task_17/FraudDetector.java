package students.eriks_jaloveckis.lesson_9.level_4.task_17;

class FraudDetector {

    boolean isFraud(Transaction t) {
        Trader trader = t.getTrader();
        if (trader.getFullName().equals("Pokemon")) {
            return true;
        }
        return false;
    }
}
