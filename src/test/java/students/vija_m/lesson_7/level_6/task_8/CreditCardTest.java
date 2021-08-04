package students.vija_m.lesson_7.level_6.task_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {
    CreditCard subject = new CreditCard(123456789, 9999);

    @Test
    void depositPinIsWrong() {
        subject.setCreditLimit(1000.00);
        subject.deposit(9998, 100);
        assertEquals(0, subject.getBalance());
        assertEquals(0, subject.getCardDebt());
    }

    @Test
    void withdrawPinIsWrong() {
        subject.setCreditLimit(1000.00);
        subject.withdraw(9998, 100);
        assertEquals(0, subject.getBalance());
        assertEquals(0, subject.getCardDebt());
    }

    @Test
    void deposit() {
        subject.setCreditLimit(1000.00);
        subject.deposit(9999, 100);
        assertEquals(100, subject.getBalance());
        assertEquals(0, subject.getCardDebt());
    }

    @Test
    void withdraw() {
        subject.setCreditLimit(1000.00);
        subject.withdraw(9999, 100);
        assertEquals(0, subject.getBalance());
        assertEquals(100, subject.getCardDebt());
    }

    @Test
    void withdrawExceedsCreditLimit() {
        subject.setCreditLimit(1000.00);
        subject.withdraw(9999, 1100);
        assertEquals(0, subject.getBalance());
        assertEquals(0, subject.getCardDebt());
    }

    @Test
    void depositBeforeWithdraw1() {
        subject.setCreditLimit(1000.00);
        subject.deposit(9999, 200);
        subject.withdraw(9999, 1100);
        assertEquals(0, subject.getBalance());
        assertEquals(900, subject.getCardDebt());
    }

    @Test
    void depositBeforeWithdraw2() {
        subject.setCreditLimit(1000.00);
        subject.deposit(9999, 1201);
        subject.withdraw(9999, 1100);
        assertEquals(101, subject.getBalance());
        assertEquals(0, subject.getCardDebt());
    }

    @Test
    void withdrawBeforeDeposit1() {
        subject.setCreditLimit(1000.00);
        subject.withdraw(9999, 800);
        subject.deposit(9999, 600);
        assertEquals(0, subject.getBalance());
        assertEquals(200, subject.getCardDebt());
    }

    @Test
    void withdrawBeforeDeposit2() {
        subject.setCreditLimit(1000.00);
        subject.withdraw(9999, 600.99);
        subject.deposit(9999, 800.79);
        assertEquals(199.80, subject.getBalance(), 0.001);
        assertEquals(0, subject.getCardDebt());
    }
}

