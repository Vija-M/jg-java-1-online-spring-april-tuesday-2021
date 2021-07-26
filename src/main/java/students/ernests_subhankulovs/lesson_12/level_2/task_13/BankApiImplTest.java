package students.ernests_subhankulovs.lesson_12.level_2.task_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class BankApiImplTest {

    Assertions assertions = new Assertions();

    public static void main(String[] args) throws AccessDeniedException {
        BankApiImplTest test = new BankApiImplTest();
        test.testFindByUid();
    }

    public void testFindByUid() throws AccessDeniedException {
        List<BankClient> clients = new ArrayList<>();
        clients.add(new BankClient("C1", "Romeo Sosa"));
        clients.add(new BankClient("C2", "Jared Nash"));
        clients.add(new BankClient("C3", "Salvador Cain"));
        BankApiImpl apiImplementation = new BankApiImpl(clients);
        UserCredentials userCredentials = new UserCredentials(Arrays.asList(Role.values()));
        Optional<BankClient> bankClientFound = apiImplementation.findByUid(userCredentials, "C1");
        assertions.assertStringTestResult("Romeo Sosa", bankClientFound.get().getFullName(), "Full name test");
        assertions.assertStringTestResult("C1", bankClientFound.get().getUid(), "UID test");
        bankClientFound = apiImplementation.findByUid(userCredentials, "C4");
        assertions.assertOptionalTestResult(Optional.empty(), bankClientFound, "Client not fount test");
    }
}
