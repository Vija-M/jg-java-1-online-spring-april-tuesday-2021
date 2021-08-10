package students.linda_junkina.lesson_15.level_2.task_9;

class FraudDetector {
    public boolean isFraud(Trader trader) {
        return compareTraderNameWithScammerName(trader)
                ||
                compareTraderCityWithScammerCity(trader);
    }

    private boolean compareTraderNameWithScammerName(Trader trader) {
        return trader.getFullName().equals("Pokemon");
    }

    private boolean compareTraderCityWithScammerCity(Trader trader) {
        return trader.getCity().equals("Sidney");
    }
}
