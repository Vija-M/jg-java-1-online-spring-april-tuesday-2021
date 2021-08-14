package students.ernests_subhankulovs.lesson_14.level_6.task_37;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
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

    public List<String> findTraderNamesByCity(List<Transaction> transactions, String city) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals(city))
                .map(Trader::getName)
                .distinct()
                .collect(Collectors.toList());
    }

    public boolean checkTradersFromCity(List<Transaction> transactions, String city) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals(city))
                .map(Trader::getName)
                .count() > 0;
    }

    public Optional<Integer> getLargestValue(List<Transaction> transactions) {
        Integer largestValue;
        largestValue = transactions.stream()
                .map(Transaction::getValue)
                .max(Integer::compare)
                .get();
        if (largestValue == null) {
            return Optional.empty();
        }
        else {
            return Optional.of(largestValue);
        }
    }

    public Optional<Integer> getSmallestValue(List<Transaction> transactions) {
        Integer largestValue;
        largestValue = transactions.stream()
                .map(Transaction::getValue)
                .min(Integer::compare)
                .get();
        if (largestValue == null) {
            return Optional.empty();
        }
        else {
            return Optional.of(largestValue);
        }
    }

    public String getTraderNames(List<Transaction> transactions) {
        return transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted()
                .collect(Collectors.joining(","));
    }

}
