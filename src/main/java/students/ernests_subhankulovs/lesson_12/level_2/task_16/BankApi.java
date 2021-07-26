package students.ernests_subhankulovs.lesson_12.level_2.task_16;

import java.util.Optional;

interface BankApi {
    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;
}
