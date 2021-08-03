package students.linda_junkina.lesson_14.level_4.task_25_26_27_28_29_30_31;

import java.util.List;

import static java.util.stream.Collectors.toList;

class TransactionAnalysisService {

    public List<Integer> findYearsOfTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getYear())
                .collect(toList());
    }

    public List<Integer> findUniqueYearsOfTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getYear())
                .distinct()
                .collect(toList());
    }

    public List<String> findUniqueTradersNames(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .collect(toList());
    }

    public List<String> findUniqueCities(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(toList());
    }

    public List<String> findAllTradersInCity(List<Transaction> transactions, String cityToFind) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader())
                .filter(trader -> trader.getCity().equals(cityToFind))
                .map(trader -> trader.getName())
                .distinct()
                .collect(toList());
    }
}
