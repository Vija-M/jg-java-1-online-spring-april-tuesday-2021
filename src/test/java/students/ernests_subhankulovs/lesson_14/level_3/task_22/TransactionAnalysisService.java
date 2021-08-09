package students.ernests_subhankulovs.lesson_14.level_3.task_22;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class TransactionAnalysisService {

    public static void main(String[] args) {
        TransactionTestData data = new TransactionTestData();
        TransactionAnalysisService service = new TransactionAnalysisService();
        service.sortTransactionsByValue(data.getTransactions());
    }

    public List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .collect(Collectors.toList());
    }

    public List<Transaction> sortTransactionsByValue(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());

    }
}
