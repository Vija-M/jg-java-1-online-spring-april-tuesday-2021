package students.vija_m.lesson_15.level_2.task_9;

class FraudDetector {
    public boolean isFraud(Trader trader) {
        return isTraderFraud(trader) || isCityBlocked(trader);
    }

    private boolean isTraderFraud(Trader trader) {
        String traderName = trader.getName();
        return traderName.equals("Pokemon");
    }

    private boolean isCityBlocked(Trader trader) {
        String cityName = trader.getCity();
        return cityName.equals("Sidney");
    }
}

