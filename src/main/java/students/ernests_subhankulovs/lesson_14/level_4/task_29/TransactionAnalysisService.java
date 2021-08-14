package students.ernests_subhankulovs.lesson_14.level_4.task_29;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class TransactionAnalysisService {

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

    public List<Transaction> sortTransactionsByValueReversed(List<Transaction> transactions) {
        return transactions.stream()
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .collect(Collectors.toList());

    }

    public List<Transaction> findTransactionsByYearAndByValue(List<Transaction> transactions, int year) {
        return transactions.stream()
                .filter(t -> t.getYear() == year)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());

    }

    public List<Integer> findTransactionYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .collect(Collectors.toList());
    }

    public List<Integer> findDistinctTransactionYears(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getYear)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> findDistinctTraderCities(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> findDistinctTraderNames(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> findTraderNamesFromCambridge(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .map(Trader::getName)
                .distinct()
                .collect(Collectors.toList());
    }
}
