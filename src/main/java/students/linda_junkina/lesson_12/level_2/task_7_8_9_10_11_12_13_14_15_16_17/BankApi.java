package students.linda_junkina.lesson_12.level_2.task_7_8_9_10_11_12_13_14_15_16_17;

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;
}
