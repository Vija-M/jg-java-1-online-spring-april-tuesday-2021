package students.arturs_arutjunovs.lesson_9.level_5.task_29;

class FraudDetector {

    FraudRule[] fraudRules;
    FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }

    boolean isFraud(Transaction t) {
        for (FraudRule rule : fraudRules) {
            if (rule.isFraud(t)) {
                return true;
            }
        }
        return false;
    }
}
