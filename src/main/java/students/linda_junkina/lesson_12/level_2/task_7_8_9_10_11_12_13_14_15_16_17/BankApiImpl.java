package students.linda_junkina.lesson_12.level_2.task_7_8_9_10_11_12_13_14_15_16_17;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BankApiImpl implements BankApi {
    private List<BankClient> clients;


    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }



    @Override
    public Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException {

        if (!credentials.getRoles().contains(Role.CAN_SEARCH_CLIENTS)) {
            throw new AccessDeniedException();
        }
        for (BankClient client : clients) {
            if (client.getUid().equals(uid)) {
                return Optional.of(client);
            }
        }
        return Optional.empty();
    }
}
