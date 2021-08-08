package students.vija_m.lesson_15.level_2.task_9;

class FraudDetector {
    public boolean isFraud(Trader trader) {
        return (compareTraderName(trader)
                ||
                (compareCity(trader))
        );
    }

    private boolean ifTraderIsFraud(Trader trader) {
        String traderName = trader.getFullName();
        {
            return traderName.equals("Pokemon");
        }
    }

    private boolean ifCityIsBlocked(Trader trader) {
        String cityName = trader.getCity();
        {
            return cityName.equals("Sidney");
        }
    }
}

