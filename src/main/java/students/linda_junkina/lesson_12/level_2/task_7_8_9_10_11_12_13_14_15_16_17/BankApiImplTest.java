package students.linda_junkina.lesson_12.level_2.task_7_8_9_10_11_12_13_14_15_16_17;

import java.util.ArrayList;
import java.util.List;

class BankApiImplTest {
    public static void main(String[] args) {
        BankApiImplTest test = new BankApiImplTest();
        test.findByUid();
        test.shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole();
    }

    public void findByUid(){
        BankClient client1 = new BankClient("1", "John Doe");
        BankClient client2 = new BankClient("2", "Sarah Doe");

        List<BankClient> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);

        BankApi api = new BankApiImpl(clients);
//        checkTestResult("John Doe", api.findByUid(credentials, "1"));
    }

    public void shouldThrowExceptionWhenCredentialsNotHaveAppropriateRole() {
        List<BankClient> clients = new ArrayList();
        BankApi api = new BankApiImpl(clients);

        List<Role> roles = new ArrayList();
        UserCredentials credentials = new UserCredentials(roles);

        try {
            api.findByUid(credentials, "1234");
            System.out.println("TEST FAIL"); // потому что если мы дошли до этой строки,
            // значит что метод findByUid() не кинул ошибку, а он был должен сделать это
            // так как в credentials нет нужной роли
        } catch(AccessDeniedException e) {
            System.out.println("TEST OK");
        }
    }

    private void checkTestResult(BankClient expected,  BankClient actual) {
        if (expected.equals(actual)) {
            System.out.println("Find bank client - OK!");
        } else {
            System.out.println("Find bank client - FAIL!");
        }
    }

}
