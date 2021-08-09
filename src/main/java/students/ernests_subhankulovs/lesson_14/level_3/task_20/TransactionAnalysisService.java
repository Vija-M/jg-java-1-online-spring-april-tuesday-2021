package students.ernests_subhankulovs.lesson_14.level_3.task_20;

import java.util.List;
import java.util.stream.Collectors;

class TransactionAnalysisService {
    public List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .collect(Collectors.toList());
    }
}
