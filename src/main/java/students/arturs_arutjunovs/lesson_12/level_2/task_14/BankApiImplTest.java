package students.arturs_arutjunovs.lesson_12.level_2.task_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class BankApiImplTest {
    public static void main(String[] args) throws AccessDeniedException {

        BankApiImplTest test = new BankApiImplTest();
        test.testFindClientByUid();
        test.shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole();
    }

    public void testFindClientByUid() throws AccessDeniedException {
        List<BankClient> clients = new ArrayList<>();
        BankApiImpl api = new BankApiImpl(clients);
        UserCredentials userCredentials = new UserCredentials(Arrays.asList(Role.values()));
        clients.add(new BankClient("ONE", "Willie Gordon"));
        clients.add(new BankClient("TWO", "Andrew Robson"));
        clients.add(new BankClient("THREE", "Ray Mitchel"));

        Optional<BankClient> findAppropriateClient = api.findByUid(userCredentials, "TWO");
        assertUidTestResult(findAppropriateClient.get().getUid(), "TWO", "Uid test");
        assertFindNameTestResult(findAppropriateClient.get().getFullName(), "Andrew Robson", "Full name test");
        findAppropriateClient = api.findByUid(userCredentials,"FOUR");
        assertNameNotFindTestResult(findAppropriateClient, Optional.empty(), "Client was not found");
    }

    public void shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole() {
        List<BankClient> clients = new ArrayList();
        BankApi api = new BankApiImpl(clients);

        List<Role> roles = new ArrayList();
        UserCredentials credentials = new UserCredentials(roles);

        try {
            api.findByUid(credentials, "1234");
            System.out.println("[TEST FAIL]: Exception test");
        } catch (AccessDeniedException e) {
            System.out.println("[TEST OK]: Exception test");
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
    private void assertNameNotFindTestResult(Optional actualResult , Optional expectedResult, String testName ) {
         if (actualResult.equals(expectedResult)) {
            System.out.println("[TEST OK]: " + testName);
        } else {
            System.out.println("[TEST FAIL]: " + testName);
        }
    }
}
