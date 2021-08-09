package students.vija_m.lesson_7.level_7.task_14;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    @Test
    void shouldFindByID() {
        UserRepository victim = new UserRepository();
        UserEntity user1 = new UserEntity("Alan", "Po", "000011-00000");
        UUID uuid1 = victim.save(user1);

        UserEntity found = victim.findByID(uuid1);
        assertEquals(user1.getPersonalCode(), found.getPersonalCode(), "User found by ID");
    }

    @Test
    void shouldFindByName() {
        UserRepository victim = new UserRepository();
        UserEntity user1 = new UserEntity("Alan", "Po", "000011-00000");
        UUID uuid1 = victim.save(user1);

        UserEntity found = victim.findByName(user1.getFirstName());
        assertEquals(user1.getPersonalCode(), found.getPersonalCode(), "User found by name");
    }

    @Test
    void deletedUser() {
        UserRepository victim = new UserRepository();
        UserEntity user1 = new UserEntity("Alan", "Po", "000011-00000");
        UUID uuid1 = victim.save(user1);

        assertEquals(user1, victim.delete(uuid1));

    }
}