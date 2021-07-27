package students.dmitrijs_matrenicevs.lesson_12.level_2.task_7_17;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BankApiImplTest {

    public static void main(String[] args) {
        BankApiImplTest bankApiImplTest = new BankApiImplTest();
        bankApiImplTest.shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole();
        bankApiImplTest.findByUid();
    }

    public void shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole() {
        List<BankClient> clients = new ArrayList<>();
        BankApi api = new BankApiImpl(clients);

        List<Role> roles = new ArrayList<>();
        UserCredentials credentials = new UserCredentials(roles);

        try {
            api.findByUid(credentials, "1234");
            System.out.println("TEST FAIL");
        } catch (AccessDeniedException e) {
            System.out.println("TEST OK");
        }
    }

    public void findByUid() {
        BankClient bankClient = new BankClient("MAKS", "FILM");
        BankClient bankClient1 = new BankClient("RICA", "MICA");
        BankClient bankClient2 = new BankClient("NIKA", "PIKA");

        List<BankClient> clients = List.of(bankClient, bankClient1, bankClient2);
        List<Role> roles = List.of(Role.CAN_SEARCH_CLIENTS);
        UserCredentials credentials = new UserCredentials(roles);

        BankApi bankApi = new BankApiImpl(clients);

        try {
            Optional<BankClient> realResult = Optional.of(bankClient);
            Optional<BankClient> expectedResult = bankApi.findByUid(credentials, "MAKS");
            assertResultTest(expectedResult, realResult);
        } catch (AccessDeniedException ignored) {
        }
    }

    public void assertResultTest(Optional<BankClient> expectedResult, Optional<BankClient> realResult) {
        if (expectedResult.equals(realResult)) {
            System.out.println("TEST OK");
        } else {
            System.out.println("TEST FAIL");
        }
    }
}
