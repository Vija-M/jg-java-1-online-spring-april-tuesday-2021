package students.dmitriy_shukailo.lesson_12.level_2.task_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class BankApiImplTest {

    public static void main(String[] args) throws AccessDeniedException {

        BankApiImplTest test = new BankApiImplTest();
        test.shouldFindClientByUid();
    }

    public void shouldFindClientByUid() throws AccessDeniedException {

        List<BankClient> clients = new ArrayList();
        BankApiImpl bankApiImpl = new BankApiImpl(clients);
        UserCredentials credentials = new UserCredentials(Arrays.asList(Role.values()));

        clients.add(new BankClient("1", "John Connor"));
        clients.add(new BankClient("2", "Sara Connor"));
        clients.add(new BankClient("3", "T-600"));

        Optional<BankClient> findBankClientByUid = bankApiImpl.findByUid(credentials, "1");
        Assertions.assertEquals(findBankClientByUid.get().getUid(), "1", "Client uid");
        Assertions.assertEquals(findBankClientByUid.get().getFullName(), "John Connor", "Client full name");

        findBankClientByUid = bankApiImpl.findByUid(credentials, "5");
        Assertions.assertEquals(findBankClientByUid, Optional.empty(), "Client not found");
    }
}

