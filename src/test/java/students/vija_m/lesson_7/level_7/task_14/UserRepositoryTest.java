package students.vija_m.lesson_7.level_7.task_14;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {
   UserRepository victim = new UserRepository();
    public UUID[] addNewUsers(UserRepository userRepository) {
        UserEntity user1 = new UserEntity("Alan", "Po", "000011-00000");
        UserEntity user2 = new UserEntity("Mary", "Green", "000012-00000");
        UserEntity user3 = new UserEntity("John", "Doe", "000013-00000");
        UUID user1Id = userRepository.save(user1);
        UUID user2Id = userRepository.save(user2);
        UUID user3Id = userRepository.save(user3);
        return new UUID[] {user1Id, user2Id, user3Id};
    }
    @Test

    void ifUserIsSaved() {
}