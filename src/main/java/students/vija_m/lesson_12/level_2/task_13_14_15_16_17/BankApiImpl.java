package students.vija_m.lesson_12.level_2.task_13_14_15_16_17;

import java.util.List;
import java.util.Optional;

class BankApiImpl implements BankApi {

    private final List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    @Override
    public Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException {
        if (!credentials.hasRole(Role.CAN_SEARCH_CLIENTS)) {
            throw new AccessDeniedException();
        }
        for ( BankClient client : clients ) {
            if (client.getUid().equals(uid)) {
                return Optional.of(client);
            }
        }
        return Optional.empty();
    }
}
// если в credentials нет роли Role.CAN_SEARCH_CLIENTS
// то метод должен кидать ошибку AccessDeniedException
// иначе производить поиск клиента с указанным uid
