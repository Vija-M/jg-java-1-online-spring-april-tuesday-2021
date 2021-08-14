package students.arturs_arutjunovs.lesson_9.level_4.task_21;

class FraudDetector {

    boolean rejectPerson(Transaction t) {
        Trader trader = t.getTrader();
        return trader.getFullName().equals("Pokemon");
    }

    boolean rejectAmount(Transaction t) {
        return t.getAmount() > 1000000;
    }

    boolean rejectCity(Transaction t) {
        Trader trader = t.getTrader();
        return trader.getCity().equals("Sydney");
    }

    boolean rejectCountry(Transaction t) {
        Trader trader = t.getTrader();
        return trader.getCountry().equals("Jamaica");
    }

    boolean rejectCountryAndAmount(Transaction t) {
        Trader trader = t.getTrader();
        return trader.getCountry().equals("Germany") && t.getAmount() > 1000;
    }
}
