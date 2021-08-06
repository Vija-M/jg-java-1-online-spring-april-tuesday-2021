package students.vija_m.lesson_7.level_7.task_14;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;

class UserRepository {
    private UserEntity[] users;
    private int cursor = 0;

    public UserRepository() {
        users = new UserEntity[100];
    }

    UUID save(UserEntity entity) {
        UUID randomUUID = UUID.randomUUID();
        entity.setId(randomUUID);
        users[cursor] = entity;
        cursor++;
        return randomUUID;
    }

    UserEntity findByID(UUID uuid) {
        for (UserEntity entity : users) {
            if (entity.getId().equals(uuid)) {
                return entity;
            }
        }
        throw new NoSuchElementException();
    }

    UserEntity findByName(String name) {
        for (UserEntity entity : users) {
            if (entity.getName().equals(name)) {
                return entity;
            }
        }
        return null;
    }

    UserEntity[] findAll() {
        return users;
    }

    UserEntity updateUser(UUID uuid) {
        for (UserEntity entity : users) {
            if (entity.getId().equals(uuid)) {
                entity.setName(entity.getName());
                entity.setFamilyName(entity.getFamilyName());
                entity.setPersonalCode(entity.getPersonalCode());
            }
            {
                return entity;
            }
        }
        return null;
    }

    void delete(UUID uuid) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getId().equals(uuid)) {
                users[i] = null;
                break;
            }
        }
    }

}

