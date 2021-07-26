package students.ernests_subhankulovs.lesson_9.level_5.task_22;

public class Rule2FraudDetector extends FraudDetector  {
    @Override
    boolean isFraud(Transaction t) {
        return (t.getAmount() > 1000000);
    }
}
