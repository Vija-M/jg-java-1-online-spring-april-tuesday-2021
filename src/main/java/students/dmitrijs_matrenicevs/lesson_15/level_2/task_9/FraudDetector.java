package students.dmitrijs_matrenicevs.lesson_15.level_2.task_9;

class FraudDetector {

    public boolean isFraud(Trader trader) {
        return isNameBanned(trader) || isCityBanned(trader);
    }

    private boolean isNameBanned(Trader trader) {
        return trader.getName().equals("Pokemon");
    }

    private boolean isCityBanned(Trader trader) {
        var isCityBanned = trader.getCity();
        return isCityBanned.equals("Sydney");
    }
}
