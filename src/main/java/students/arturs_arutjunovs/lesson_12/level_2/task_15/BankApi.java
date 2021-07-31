package students.arturs_arutjunovs.lesson_12.level_2.task_15;

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;


}
