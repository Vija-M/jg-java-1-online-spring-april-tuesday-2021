package students.dmitriy_shukailo.lesson_15.level_2.task_9;

class FraudDetector {

    boolean isFraud(Trader trader) {
        return isFraudTraderName(trader) || isFraudTraderCity(trader);
    }

    boolean isFraudTraderName(Trader trader) {
        String traderName = trader.getFullName();
        return traderName.equals("Pokemon");
    }

    boolean isFraudTraderCity(Trader trader) {
        String cityName = trader.getCity();
        return cityName.equals("Sidney");
    }

}