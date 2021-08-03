package students.linda_junkina.lesson_14.level_6.task_35_36_37_38;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class TransactionAnalysisService {
    public Optional<Integer> findMaxValue(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getValue())
                .max(Integer::compare);
    }

    public Optional<Integer> findMinValue(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getValue())
                .min(Integer::compare);
    }

    public String findTraderNamesAndPutInAlphabeticOrder(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .sorted(Comparator.naturalOrder())
                .distinct()
                .collect(Collectors.joining(", "));
    }

    public String findCitiesAndPutInAlphabeticOrder(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .sorted(Comparator.naturalOrder())
                .distinct()
                .collect(Collectors.joining(", "));
    }
}
