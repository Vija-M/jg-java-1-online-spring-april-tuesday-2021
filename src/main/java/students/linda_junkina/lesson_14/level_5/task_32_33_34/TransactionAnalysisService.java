package students.linda_junkina.lesson_14.level_5.task_32_33_34;

import java.util.List;

import static java.util.stream.Collectors.toList;

class TransactionAnalysisService {
    public boolean checkIfAnyTraderIsInCity(List<Transaction> transactions, String city) {
        return transactions.stream()
                .anyMatch(t -> t.getTrader().getCity().equals(city));
    }

}
