package students.dmitriy_shukailo.lesson_12.level_2.task_12;

import java.util.Optional;

public interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;

}