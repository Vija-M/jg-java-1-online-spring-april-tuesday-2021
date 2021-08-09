package students.arturs_arutjunovs.lesson_14.level_3.task_18_to_24;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

class TransactionAnalysisService {

     public List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .collect(toList());
    }

    public List<Transaction> sortTransactionsByValueMinToMax(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(toList());
    }

    public List<Transaction> sortTransactionsByValueMaxToMin(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .collect(toList());
    }

    public List<Transaction> findTransactionsByYearAndSortByValue(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(toList());
    }
}
