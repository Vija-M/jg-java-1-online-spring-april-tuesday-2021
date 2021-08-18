package students.vija_m.lesson_12.level_2.task_13_14_15_16_17;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BankApiImplTest {
    public static void main(String[] args) {
        BankApiImplTest test = new BankApiImplTest();
        test.findByUid();
        test.shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole();
    }

    public void findByUid() {
        BankClient client1 = new BankClient("C1", "Mary Green");
        BankClient client2 = new BankClient("C2", "Anna Rosa");
        BankClient client3 = new BankClient("C3", "John Doe");
        List<BankClient> clients = List.of(client1, client2, client3);

        List<Role> roles = List.of(Role.CAN_SEARCH_CLIENTS);
        UserCredentials credentials = new UserCredentials(roles);

        BankApi victim = new BankApiImpl(clients);

        try {
            Optional<BankClient> expected = Optional.of(client1);
            Optional<BankClient> actual = victim.findByUid(credentials, "C1");
            checkTestResult(expected, actual);
        } catch (AccessDeniedException e) {
            System.out.println("Test Failed - exception is thrown");
        }
    }

    public void shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole() {
        List<BankClient> clients = new ArrayList();
        List<Role> roles = new ArrayList();
        UserCredentials credentials = new UserCredentials(roles);
        BankApi victim = new BankApiImpl(clients);

        try {
            victim.findByUid(credentials, "C2");
            System.out.println("Test failed - user have access");// потому что если мы дошли до этой строки,
            // значит что метод findByUid() не кинул ошибку, а он был должен сделать это
            // так как в credentials нет нужной роли
        } catch (AccessDeniedException e) {
            System.out.println("Test OK - exception is thrown");
        }
    }

    private void checkTestResult(Optional<BankClient> expected, Optional<BankClient> actual) {
        if (expected.equals(actual)) {
            System.out.println("TEST OK - client found");
        } else {
            System.out.println("TEST FAILED - client not found");
        }
    }
}


