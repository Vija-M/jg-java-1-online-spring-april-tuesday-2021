package students.vija_m.lesson_12.level_2.task_13_14_15_16_17;

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;
}
