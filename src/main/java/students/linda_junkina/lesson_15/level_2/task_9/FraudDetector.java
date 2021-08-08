package students.linda_junkina.lesson_15.level_2.task_9;

class FraudDetector {
    boolean isFraud(Trader trader) {
        if (compareTraderName(trader)
                ||
                (compareCity(trader))
        ) {
            return true;
        } else {
            return false;
        }
    }

    boolean compareTraderName (Trader trader) {
        String traderName = trader.getFullName();
        String scammerName = trader.getNameOfTheScammer();
        if (traderName.equals(scammerName)) {
        }
        return true;
    }

    boolean compareCity(Trader trader) {
        String cityName = trader.getCity();
        String scammerCity = trader.getCityOfTheScammer();
        if (cityName.equals(scammerCity)) {
            return true;
        } else {
            return false;
        }
    }

}
