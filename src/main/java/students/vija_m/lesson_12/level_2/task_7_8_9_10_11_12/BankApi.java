package students.vija_m.lesson_12.level_2.task_7_8_9_10_11_12;

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;
}
