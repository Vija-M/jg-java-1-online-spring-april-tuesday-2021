package students.linda_junkina.lesson_14.level_3.task_18_19_20_21_22_23_24;

import java.util.List;

import static java.util.stream.Collectors.toList;

class TransactionAnalysisService {

    public List<Transaction> findTransactionsByYear(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .collect(toList());
    }
    public List<Transaction> sortTransactionsByValue(List<Transaction> transactions) {
        return null;
        //TODO
    }
}


