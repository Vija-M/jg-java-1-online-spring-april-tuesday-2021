package students.linda_junkina.lesson_14.level_5.task_32_33_34;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionAnalysisServiceTest {
    TransactionAnalysisService service = new TransactionAnalysisService();
    TransactionTestData data = new TransactionTestData();

    @Test
    void checkCambridgeForTrader() {
        List<Transaction> transactions = data.getTransactions();
        assertEquals(true, service.checkIfAnyTraderIsInCity(transactions, "Cambridge"));
    }

    @Test
    void checkMilanForTrader() {
        List<Transaction> transactions = data.getTransactions();
        assertEquals(true, service.checkIfAnyTraderIsInCity(transactions, "Milan"));
    }

    @Test
    void checkLondonForTrader() {
        List<Transaction> transactions = data.getTransactions();
        assertEquals(false, service.checkIfAnyTraderIsInCity(transactions, "London"));
    }
}