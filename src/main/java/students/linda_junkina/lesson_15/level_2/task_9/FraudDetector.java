package students.linda_junkina.lesson_15.level_2.task_9;

class FraudDetector {
    public boolean isFraud(Trader trader) {
        return compareTraderNameWithScammerName(trader)
                ||
                (compareTraderCityWithScammerCity(trader));
    }

    private boolean compareTraderNameWithScammerName(Trader trader) {
        String traderName = trader.getFullName();
        String scammerName = trader.getNameOfTheScammer();
        return traderName.equals(scammerName);
    }

    private boolean compareTraderCityWithScammerCity(Trader trader) {
        String cityName = trader.getCity();
        String scammerCity = trader.getCityOfTheScammer();
        return cityName.equals(scammerCity);
    }
}
