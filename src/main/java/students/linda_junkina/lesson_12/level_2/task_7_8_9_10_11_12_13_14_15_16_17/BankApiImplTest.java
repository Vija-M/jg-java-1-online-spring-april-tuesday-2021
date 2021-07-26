package students.linda_junkina.lesson_12.level_2.task_7_8_9_10_11_12_13_14_15_16_17;

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
        BankClient client1 = new BankClient("1", "John Doe");
        BankClient client2 = new BankClient("2", "Sarah Doe");

        List<BankClient> clients = List.of(client1,client2);

        List<Role> roles = List.of(Role.CAN_SEARCH_CLIENTS);
        UserCredentials credentials = new UserCredentials(roles);

        BankApi api = new BankApiImpl(clients);

        try {
            Optional<BankClient> expected = Optional.of(client1);
            Optional<BankClient> actual = api.findByUid(credentials, "1");
            checkTestResult(expected, actual);

        } catch (AccessDeniedException e) {
            System.out.println("TEST FAILED - exception thrown");
        }
    }

    public void shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole() {
        List<BankClient> clients = new ArrayList();
        BankApi api = new BankApiImpl(clients);

        List<Role> roles = new ArrayList();
        UserCredentials credentials = new UserCredentials(roles);

        try {
            api.findByUid(credentials, "2");
            System.out.println("TEST FAILED - access provided");
        } catch (AccessDeniedException e) {
            System.out.println("TEST OK - exception thrown");
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
