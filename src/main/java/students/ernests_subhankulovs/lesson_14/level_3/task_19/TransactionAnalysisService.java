package students.ernests_subhankulovs.lesson_14.level_3.task_19;

import java.util.List;
import java.util.stream.Collectors;

class TransactionAnalysisService {
    public List<Transaction> findTransactionsIn2011(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> t.getYear() == 2011)
                .collect(Collectors.toList());
    }
}
