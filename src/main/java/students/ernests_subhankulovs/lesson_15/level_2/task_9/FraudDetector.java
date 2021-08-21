package students.ernests_subhankulovs.lesson_15.level_2.task_9;

class FraudDetector {

    public boolean isFraud(Trader trader) {
        return (detectFraudByTraderName(trader) || (detectFraudByCity(trader)));
    }

    private boolean detectFraudByTraderName(Trader trader) {
        return (trader.getName().equals("Pokemon"));
    }

    private boolean detectFraudByCity(Trader trader) {
        return (trader.getCity().equals("Sidney"));
    }

}
