package students.vija_m.lesson_7.level_7.task_14;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {
    UserRepository victim = new UserRepository();
    UserEntity user1 = new UserEntity("Alan", "Po", "000011-00000");
    UUID uuid1 = victim.save(user1);

        @Test
    void shouldFindByID() {
        UserEntity found = victim.findByID(uuid1);
        assertEquals(user1.getPersonalCode(), found.getPersonalCode(), "User found by ID");
    }

    @Test
    void shouldFindByName() {
        UserEntity found = victim.findByName(user1.getFirstName());
        assertEquals(user1.getPersonalCode(), found.getPersonalCode(), "User found by name");
    }

    @Test
    void shouldDelete() {
        assertNull(victim.delete(uuid1), "User is deleted");
    }
}