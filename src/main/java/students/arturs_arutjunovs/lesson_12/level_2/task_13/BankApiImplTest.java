package students.arturs_arutjunovs.lesson_12.level_2.task_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class BankApiImplTest {
    public static void main(String[] args) throws AccessDeniedException {

        BankApiImplTest test = new BankApiImplTest();
        test.testFindClientByUid();
    }

    public void testFindClientByUid() {
        List<BankClient> clients = new ArrayList<>();
        BankApiImpl api = new BankApiImpl(clients);
        UserCredentials userCredentials = new UserCredentials(Arrays.asList(Role.values()));
        clients.add(new BankClient("ONE", "Willie Gordon"));
        clients.add(new BankClient("TWO", "Andrew Robson"));
        clients.add(new BankClient("THREE", "Ray Mitchel"));

        try {
            Optional<BankClient> findAppropriateClient = api.findByUid(userCredentials, "TWO");
            assertUidTestResult(findAppropriateClient.get().getUid(), "TWO", "Uid test");
            assertFindNameTestResult(findAppropriateClient.get().getFullName(), "Andrew Robson", "Full name test");
        } catch (AccessDeniedException ignored) {
        }
    }

    private void assertUidTestResult(String actualResult, String expectedResult, String testName) {
        if (actualResult.equals(expectedResult)) {
            System.out.println("[TEST OK]: " + testName);
        } else {
            System.out.println("[TEST FAIL]: " + testName);
        }
    }

    private void assertFindNameTestResult(String actualResult, String expectedResult, String testName) {
        if (actualResult.equals(expectedResult)) {
            System.out.println("[TEST OK]: " + testName);
        } else {
            System.out.println("[TEST FAIL]: " + testName);
        }
    }
}
