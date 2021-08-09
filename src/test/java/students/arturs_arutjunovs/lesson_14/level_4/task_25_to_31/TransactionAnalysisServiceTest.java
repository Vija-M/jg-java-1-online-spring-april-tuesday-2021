package students.arturs_arutjunovs.lesson_14.level_4.task_25_to_31;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TransactionAnalysisServiceTest {
    TransactionAnalysisService service = new TransactionAnalysisService();
    TransactionTestData data = new TransactionTestData();

    @Test
    void findAllYears() {
        List<Transaction> transactions = data.getTransactions();
        List<Integer> expected = List.of(2011, 2012, 2011, 2012, 2012, 2012);
        assertEquals(expected, service.findAllTransactionYears(transactions));
    }

    @Test
    void findUniqueYears() {
        List<Transaction> transactions = data.getTransactions();
        List<Integer> expected = List.of(2011, 2012);
        assertEquals(expected, service.findUniqueTransactionYears(transactions));
    }

    @Test
    void findUniqueNames() {
        List<Transaction> transactions = data.getTransactions();
        List<String> expected = List.of("Brian", "Raoul", "Mario", "Alan");
        assertEquals(expected, service.findUniqueTraderNames(transactions));
    }

    @Test
    void findUniqueCities() {
        List<Transaction> transactions = data.getTransactions();
        List<String> expected = List.of("Cambridge", "Milan");
        assertEquals(expected, service.findUniqueTraderCities(transactions));
    }

    @Test
    void findTradersInCity() {
        List<Transaction> transactions = data.getTransactions();
        List<String> expected = List.of("Brian", "Raoul", "Alan");
        assertEquals(expected, service.findAllTradersInCity(transactions, "Cambridge"));
    }
}