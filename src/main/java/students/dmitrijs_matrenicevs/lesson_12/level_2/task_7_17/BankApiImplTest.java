package students.dmitrijs_matrenicevs.lesson_12.level_2.task_7_17;

import java.util.ArrayList;
import java.util.List;

class BankApiImplTest {

    public static void main(String[] args) {
        BankApiImplTest bankApiImplTest = new BankApiImplTest();
        bankApiImplTest.shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole();

    }

    public void shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole() {
        List<BankClient> clients = new ArrayList<>();
        BankApi api = new BankApiImpl(clients);

        List<Role> roles = new ArrayList<>();
        UserCredentials credentials = new UserCredentials(roles);

        try {
            api.findByUid(credentials, "1234");
            System.out.println("TEST OK");
        } catch (AccessDeniedException e) {
            System.out.println("TEST FAIL");
        }
    }
}
