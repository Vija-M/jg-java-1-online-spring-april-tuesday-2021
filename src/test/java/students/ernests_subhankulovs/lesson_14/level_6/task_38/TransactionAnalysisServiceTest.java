package students.ernests_subhankulovs.lesson_14.level_6.task_38;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class TransactionAnalysisServiceTest {
    @Test
    void shouldFindTransactionsFrom2011() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> expected = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400)
        );

        List<Transaction> actual = service.findTransactionsByYear(testData.getTransactions(), 2011);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindTransactionsFrom2012() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        List<Transaction> expected = Arrays.asList(
                new Transaction(raoul, 2012, 1000),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        List<Transaction> actual = service.findTransactionsByYear(testData.getTransactions(), 2012);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSortTransactionsByValue() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> expected = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 700),
                new Transaction(mario, 2012, 710),
                new Transaction(alan, 2012, 950),
                new Transaction(raoul, 2012, 1000)
        );

        List<Transaction> actual = service.sortTransactionsByValue(testData.getTransactions());
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSortTransactionsByValueReversed() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> expected = Arrays.asList(
                new Transaction(raoul, 2012, 1000),
                new Transaction(alan, 2012, 950),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(raoul, 2011, 400),
                new Transaction(brian, 2011, 300)
        );

        List<Transaction> actual = service.sortTransactionsByValueReversed(testData.getTransactions());
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindTransactionsByYearAndSortByValueReversed() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> expected = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400)
        );

        List<Transaction> actual = service.findTransactionsByYearAndByValue(testData.getTransactions(), 2011);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldFindTransactionYears() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();
        List<Integer> expected = Arrays.asList(2011, 2012, 2011, 2012, 2012, 2012);
        List<Integer> actual = service.findTransactionYears(testData.getTransactions());
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testFindDistinctTransactionYearsSize() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();
        Assertions.assertEquals(2, service.findDistinctTransactionYears(testData.getTransactions()).size());
    }

    @Test
    void testFindDistinctTransactionYears() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();
        List<Integer> expected = Arrays.asList(2011, 2012);
        List<Integer> actual = service.findDistinctTransactionYears(testData.getTransactions());
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testFindDistinctTraderCities() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();
        List<String> expected = Arrays.asList("Cambridge", "Milan");
        List<String> actual = service.findDistinctTraderCities(testData.getTransactions());
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testFindDistinctTraderNames() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();
        List<String> expected = Arrays.asList("Brian", "Raoul", "Mario", "Alan");
        List<String> actual = service.findDistinctTraderNames(testData.getTransactions());
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testFindTraderNamesByCityCambridge() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();
        List<String> expected = Arrays.asList("Brian", "Raoul", "Alan");
        List<String> actual = service.findTraderNamesByCity(testData.getTransactions(), "Cambridge");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testFindTraderNamesByCityMilan() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();
        List<String> expected = Arrays.asList("Mario");
        List<String> actual = service.findTraderNamesByCity(testData.getTransactions(), "Milan");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCheckTradersFromCity() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();
        boolean actual = service.checkTradersFromCity(testData.getTransactions(), "Milan");
        Assertions.assertTrue(actual);
    }

    @Test
    void testGetLargestValue() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();
        Optional<Integer> expected = Optional.of(1000);
        Optional<Integer> actual = service.getLargestValue(testData.getTransactions());
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetSmallestValue() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();
        Optional<Integer> expected = Optional.of(300);
        Optional<Integer> actual = service.getSmallestValue(testData.getTransactions());
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetTraderNames() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();
        String actual = service.getTraderNames(testData.getTransactions());
        String expected = "Alan,Brian,Mario,Raoul";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetTraderCities() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();
        String actual = service.getTraderCities(testData.getTransactions());
        String expected = "Cambridge,Milan";
        Assertions.assertEquals(expected, actual);
    }
}