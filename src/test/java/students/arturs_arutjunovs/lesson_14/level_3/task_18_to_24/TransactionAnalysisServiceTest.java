package students.arturs_arutjunovs.lesson_14.level_3.task_18_to_24;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class TransactionAnalysisServiceTest {

    TransactionAnalysisService analysisService = new TransactionAnalysisService();
    TransactionTestData testData = new TransactionTestData();

    @Test
    void findTransactionsIn2011() {
        List<Transaction> transactions = testData.getTransactions();
        List<Transaction> expected = new ArrayList<>();
        expected.add(new Transaction(new Trader("Brian", "Cambridge"), 2011, 300));
        expected.add(new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400));
        assertEquals(expected, analysisService.findTransactionsByYear(transactions, 2011));
    }

    @Test
    void findTransactionsIn2012() {
        List<Transaction> transactions = testData.getTransactions();
        List<Transaction> expected = new ArrayList<>();
        expected.add(new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000));
        expected.add(new Transaction(new Trader("Mario", "Milan"), 2012, 710));
        expected.add(new Transaction(new Trader("Mario", "Milan"), 2012, 700));
        expected.add(new Transaction(new Trader("Alan", "Cambridge"), 2012, 950));
        assertEquals(expected, analysisService.findTransactionsByYear(transactions, 2012));
    }

    @Test
    void findTransactionsIn2013() {
        List<Transaction> transactions = testData.getTransactions();
        List<Transaction> expected = new ArrayList<>();
        expected.isEmpty();
        assertEquals(expected, analysisService.findTransactionsByYear(transactions, 2013));
    }

    @Test
    void sortByValueMinToMax() {
        List<Transaction> transactions = testData.getTransactions();
        List<Transaction> expected = new ArrayList<>();
        expected.add(new Transaction(new Trader("Brian", "Cambridge"), 2011, 300));
        expected.add(new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400));
        expected.add(new Transaction(new Trader("Mario", "Milan"), 2012, 700));
        expected.add(new Transaction(new Trader("Mario", "Milan"), 2012, 710));
        expected.add(new Transaction(new Trader("Alan", "Cambridge"), 2012, 950));
        expected.add(new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000));
        assertEquals(expected, analysisService.sortTransactionsByValueMinToMax(transactions));
    }

    @Test
    void sortByValueMaxToMin() {
        List<Transaction> transactions = testData.getTransactions();
        List<Transaction> expected = new ArrayList<>();
        expected.add(new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000));
        expected.add(new Transaction(new Trader("Alan", "Cambridge"), 2012, 950));
        expected.add(new Transaction(new Trader("Mario", "Milan"), 2012, 710));
        expected.add(new Transaction(new Trader("Mario", "Milan"), 2012, 700));
        expected.add(new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400));
        expected.add(new Transaction(new Trader("Brian", "Cambridge"), 2011, 300));
        assertEquals(expected, analysisService.sortTransactionsByValueMaxToMin(transactions));
    }

    @Test
    void findTransactionsIn2011AndSortByValueMinToMax() {
        List<Transaction> transactions = testData.getTransactions();
        List<Transaction> expected = new ArrayList<>();
        expected.add(new Transaction(new Trader("Brian", "Cambridge"), 2011, 300));
        expected.add(new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400));
        assertEquals(expected, analysisService.findTransactionsByYearAndSortByValue(transactions, 2011));
    }
}
