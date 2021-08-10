package students.dmitrijs_matrenicevs.lesson_15.level_2.task_9;

class FraudDetector {

    boolean isFraud(Trader trader) {
        return compareTraderName(trader) || compareCity(trader);
    }

    boolean compareTraderName(Trader trader) {
        String traderName = trader.getName();
        switch (traderName) {
            case "Pokemon":
                break;
        }
        return true;
    }

    boolean compareCity(Trader trader) {
        var cityName = trader.getCity();
        return cityName.equals("Sidney");
    }
}
