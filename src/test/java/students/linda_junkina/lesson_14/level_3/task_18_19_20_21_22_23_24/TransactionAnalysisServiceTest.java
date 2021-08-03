package students.linda_junkina.lesson_14.level_3.task_18_19_20_21_22_23_24;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionAnalysisServiceTest {
    TransactionAnalysisService service = new TransactionAnalysisService();
    TransactionTestData data = new TransactionTestData();

    @Test
    void findTransactionsIn2011() {
        List<Transaction> transactions = data.getTransactions();
        List<Transaction> expected = new ArrayList<>();
        expected.add(new Transaction(new Trader("Brian", "Cambridge"), 2011, 300));
        expected.add(new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400));
        assertEquals(expected, service.findTransactionsByYear(transactions, 2011));
    }

    @Test
    void findTransactionsIn2012() {
        List<Transaction> transactions = data.getTransactions();
        List<Transaction> expected = new ArrayList<>();
        expected.add(new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000));
        expected.add(new Transaction(new Trader("Mario", "Milan"), 2012, 710));
        expected.add(new Transaction(new Trader("Mario", "Milan"), 2012, 700));
        expected.add(new Transaction(new Trader("Alan", "Cambridge"), 2012, 950));
        assertEquals(expected, service.findTransactionsByYear(transactions, 2012));
    }

    @Test
    void findTransactionsIn2013() {
        List<Transaction> transactions = data.getTransactions();
        List<Transaction> expected = new ArrayList<>();
        expected.isEmpty();
        assertEquals(expected, service.findTransactionsByYear(transactions, 2013));
    }

    @Test
    void sortByValueMinToMax() {
        List<Transaction> transactions = data.getTransactions();
        List<Transaction> expected = new ArrayList<>();
        expected.add(new Transaction(new Trader("Brian", "Cambridge"), 2011, 300));
        expected.add(new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400));
        expected.add(new Transaction(new Trader("Mario", "Milan"), 2012, 700));
        expected.add(new Transaction(new Trader("Mario", "Milan"), 2012, 710));
        expected.add(new Transaction(new Trader("Alan", "Cambridge"), 2012, 950));
        expected.add(new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000));
        assertEquals(expected, service.sortTransactionsByValueMinToMax(transactions));
    }

    @Test
    void sortByValueMaxToMin() {
        List<Transaction> transactions = data.getTransactions();
        List<Transaction> expected = new ArrayList<>();
        expected.add(new Transaction(new Trader("Raoul", "Cambridge"), 2012, 1000));
        expected.add(new Transaction(new Trader("Alan", "Cambridge"), 2012, 950));
        expected.add(new Transaction(new Trader("Mario", "Milan"), 2012, 710));
        expected.add(new Transaction(new Trader("Mario", "Milan"), 2012, 700));
        expected.add(new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400));
        expected.add(new Transaction(new Trader("Brian", "Cambridge"), 2011, 300));
        assertEquals(expected, service.sortTransactionsByValueMaxToMin(transactions));
    }

    @Test
    void findTransactionsIn2011AndSortByValueMinToMax() {
        List<Transaction> transactions = data.getTransactions();
        List<Transaction> expected = new ArrayList<>();
        expected.add(new Transaction(new Trader("Brian", "Cambridge"), 2011, 300));
        expected.add(new Transaction(new Trader("Raoul", "Cambridge"), 2011, 400));
        assertEquals(expected, service.findTransactionsByYearAndSortByValue(transactions, 2011));
    }
}