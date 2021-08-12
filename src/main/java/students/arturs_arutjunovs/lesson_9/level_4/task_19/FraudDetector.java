package students.arturs_arutjunovs.lesson_9.level_4.task_19;

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

}
