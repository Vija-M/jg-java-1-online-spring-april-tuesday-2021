package students.ernests_subhankulovs.lesson_9.level_6.task_33;

class FraudDetector {

    FraudRule[] fraudRules;

    FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }

    FraudDetectionResult isFraud(Transaction t) {
        for (FraudRule rule : fraudRules) {
            if (rule.isFraud(t)) {
                System.out.println("Fraud detected!");
                System.out.println("Rule: " + rule.getRuleName());
                System.out.println(t.toString());
                return new FraudDetectionResult(true, rule.getRuleName());
            }
        }
        return new FraudDetectionResult(false, null);
    }

}