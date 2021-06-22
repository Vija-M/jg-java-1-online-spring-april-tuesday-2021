package students.ernests_subhankulovs.lesson_7.level_7.task_14;

import java.util.UUID;

class UserRepository {

    private UserEntity[] users;
    private int cursor = 0;

    UserRepository() {
        users = new UserEntity[100];
    }

    UUID save(UserEntity entity) {
        UUID randomUUID = UUID.randomUUID();
        entity.setId(randomUUID);
        users[cursor] = entity;
        cursor++;
        return randomUUID;
    }

    UserEntity findById(UUID uuid) {
        for (UserEntity entity : users) {
            if (entity.getId().equals(uuid)) {
                return entity;
            }
        }
        return null;
    }

    UserEntity findByPersonalCode(String personalCode) {
        for (UserEntity entity : users) {
            if (entity.getPersonalCode().equals(personalCode)) {
                return entity;
            }
        }
        return null;
    }

    UserEntity findByFirstName(String firstName) {
        for (UserEntity entity : users) {
            if (entity.getFirstName().equals(firstName)) {
                return entity;
            }
        }
        return null;
    }

    UserEntity[] findAll() {
        return users;
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