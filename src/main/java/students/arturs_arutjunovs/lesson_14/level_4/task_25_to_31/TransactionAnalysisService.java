package students.arturs_arutjunovs.lesson_14.level_4.task_25_to_31;

import java.util.List;

import static java.util.stream.Collectors.toList;

class TransactionAnalysisService {

    public List<Integer> findAllTransactionYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getYear())
                .collect(toList());
    }

    public List<Integer> findUniqueTransactionYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getYear())
                .distinct()
                .collect(toList());
    }

    public List<String> findUniqueTraderNames(List<Transaction> transactions) {
        return transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .collect(toList());
    }

    public List<String> findUniqueTraderCities(List<Transaction> transactions) {
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
