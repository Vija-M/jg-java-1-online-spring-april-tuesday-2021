package students.ernests_subhankulovs.lesson_14.level_3.task_19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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
        Assertions.assertEquals(transactions.size(), service.findTransactionsIn2011(testData.getTransactions()).size());
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
            Assertions.assertEquals(transactions.get(i).getYear(), service.findTransactionsIn2011(testData.getTransactions()).get(i).getYear());
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
            Assertions.assertEquals(transactions.get(i).getValue(), service.findTransactionsIn2011(testData.getTransactions()).get(i).getValue());
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
            Assertions.assertEquals(transactions.get(i).getTrader().getName(), service.findTransactionsIn2011(testData.getTransactions()).get(i).getTrader().getName());
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
            Assertions.assertEquals(transactions.get(i).getTrader().getCity(), service.findTransactionsIn2011(testData.getTransactions()).get(i).getTrader().getCity());
        }
    }
}