package students.ernests_subhankulovs.lesson_14.level_4.task_28;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class TransactionAnalysisServiceTest {
    @Test
    void testFindTransactionsIn2011Size() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400)
        );
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();
        Assertions.assertEquals(transactions.size(), service.findTransactionsByYear(testData.getTransactions(), 2011).size());
    }

    @Test
    void testFindTransactionsIn2011Year() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400)
        );
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();
        for (int i = 0; i < transactions.size(); i++) {
            Assertions.assertEquals(transactions.get(i).getYear(), service.findTransactionsByYear(testData.getTransactions(), 2011).get(i).getYear());
        }
    }

    @Test
    void testFindTransactionsIn2011Value() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400)
        );
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();
        for (int i = 0; i < transactions.size(); i++) {
            Assertions.assertEquals(transactions.get(i).getValue(), service.findTransactionsByYear(testData.getTransactions(), 2011).get(i).getValue());
        }
    }

    @Test
    void testFindTransactionsIn2011TraderName() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400)
        );
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();
        for (int i = 0; i < transactions.size(); i++) {
            Assertions.assertEquals(transactions.get(i).getTrader().getName(), service.findTransactionsByYear(testData.getTransactions(), 2011).get(i).getTrader().getName());
        }
    }

    @Test
    void testFindTransactionsIn2011TraderCity() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400)
        );
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();
        for (int i = 0; i < transactions.size(); i++) {
            Assertions.assertEquals(transactions.get(i).getTrader().getCity(), service.findTransactionsByYear(testData.getTransactions(), 2011).get(i).getTrader().getCity());
        }
    }

    @Test
    void testFindTransactionsIn2012Size() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(raoul, 2012, 1000),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();
        Assertions.assertEquals(transactions.size(), service.findTransactionsByYear(testData.getTransactions(), 2012).size());
    }

    @Test
    void testFindTransactionsIn2012Year() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(raoul, 2012, 1000),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();
        for (int i = 0; i < transactions.size(); i++) {
            Assertions.assertEquals(transactions.get(i).getYear(), service.findTransactionsByYear(testData.getTransactions(), 2012).get(i).getYear());
        }
    }

    @Test
    void testFindTransactionsIn2012Value() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(raoul, 2012, 1000),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();
        for (int i = 0; i < transactions.size(); i++) {
            Assertions.assertEquals(transactions.get(i).getValue(), service.findTransactionsByYear(testData.getTransactions(), 2012).get(i).getValue());
        }
    }

    @Test
    void testFindTransactionsIn2012Name() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(raoul, 2012, 1000),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();
        for (int i = 0; i < transactions.size(); i++) {
            Assertions.assertEquals(transactions.get(i).getTrader().getName(), service.findTransactionsByYear(testData.getTransactions(), 2012).get(i).getTrader().getName());
        }
    }

    @Test
    void testFindTransactionsIn2012City() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(raoul, 2012, 1000),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();
        for (int i = 0; i < transactions.size(); i++) {
            Assertions.assertEquals(transactions.get(i).getTrader().getCity(), service.findTransactionsByYear(testData.getTransactions(), 2012).get(i).getTrader().getCity());
        }
    }

    @Test
    void testSortTransactionsByValue() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 700),
                new Transaction(mario, 2012, 710),
                new Transaction(alan, 2012, 950),
                new Transaction(raoul, 2012, 1000)
        );
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();
        for (int i = 0; i < transactions.size(); i++) {
            Assertions.assertEquals(transactions.get(i).getValue(), service.sortTransactionsByValue(testData.getTransactions()).get(i).getValue());
        }
    }

    @Test
    void testSortTransactionsByValueReversed() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(raoul, 2012, 1000),
                new Transaction(alan, 2012, 950),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(raoul, 2011, 400),
                new Transaction(brian, 2011, 300)
        );
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();
        for (int i = 0; i < transactions.size(); i++) {
            Assertions.assertEquals(transactions.get(i).getValue(), service.sortTransactionsByValueReversed(testData.getTransactions()).get(i).getValue());
        }
    }

    @Test
    void testFindTransactionsByYearAndSortByValueReversed() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2011, 400)
        );
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();
        for (int i = 0; i < transactions.size(); i++) {
            Assertions.assertEquals(transactions.get(i).getValue(), service.findTransactionsByYearAndByValue(testData.getTransactions(), 2011).get(i).getValue());
        }
    }

    @Test
    void testFindTransactionYearsSize() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();
        Assertions.assertEquals(6, service.findTransactionYears(testData.getTransactions()).size());
    }

    @Test
    void testFindTransactionYears() {
        List<Integer> years = Arrays.asList(2011, 2012, 2011, 2012, 2012, 2012);
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();
        for (int i = 0; i < years.size(); i++) {
            Assertions.assertEquals(years.get(i), service.findTransactionYears(testData.getTransactions()).get(i));
        }
    }

    @Test
    void testFindDistinctTransactionYearsSize() {
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();
        Assertions.assertEquals(2, service.findDistinctTransactionYears(testData.getTransactions()).size());
    }

    @Test
    void testFindDistinctTransactionYears() {
        List<Integer> years = Arrays.asList(2011, 2012);
        TransactionAnalysisService service = new TransactionAnalysisService();
        TransactionTestData testData = new TransactionTestData();
        for (int i = 0; i < years.size(); i++) {
            Assertions.assertEquals(years.get(i), service.findDistinctTransactionYears(testData.getTransactions()).get(i));
        }
    }
}