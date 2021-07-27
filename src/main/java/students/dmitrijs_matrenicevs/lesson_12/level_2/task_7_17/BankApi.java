package students.dmitrijs_matrenicevs.lesson_12.level_2.task_7_17;

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;
}
