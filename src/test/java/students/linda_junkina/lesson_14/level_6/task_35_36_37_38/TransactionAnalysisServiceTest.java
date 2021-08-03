package students.linda_junkina.lesson_14.level_6.task_35_36_37_38;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class TransactionAnalysisServiceTest {
    TransactionAnalysisService service = new TransactionAnalysisService();
    TransactionTestData data = new TransactionTestData();

    @Test
    void shouldFindMaxValue() {
        List<Transaction> transactions = data.getTransactions();
        Optional<Integer> expected = Optional.of(1000);
        assertEquals(expected, service.findMaxValue(transactions));
    }

    @Test
    void shouldFindMinValue() {
        List<Transaction> transactions = data.getTransactions();
        Optional<Integer> expected = Optional.of(300);
        assertEquals(expected, service.findMinValue(transactions));
    }

    @Test
    void shouldSortNamesAlphabetically() {
        List<Transaction> transactions = data.getTransactions();
        String expected = "Alan, Brian, Mario, Raoul";
        assertEquals(expected, service.findTraderNamesAndPutInAlphabeticOrder(transactions));
    }

    @Test
    void shouldSortCitiesAlphabetically() {
        List<Transaction> transactions = data.getTransactions();
        String expected = "Cambridge, Milan";
        assertEquals(expected, service.findCitiesAndPutInAlphabeticOrder(transactions));
    }
}