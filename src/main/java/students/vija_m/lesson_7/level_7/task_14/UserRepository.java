package students.vija_m.lesson_7.level_7.task_14;

import java.util.*;

class UserRepository {
    private UserEntity[] users;
    private int cursor = 0;
    Scanner scanner = new Scanner(System.in);

    UserRepository() {
        users = new UserEntity[0];
    }

    UUID save(UserEntity entity) {
        users = Arrays.copyOf(users, users.length + 1);
        UUID randomUUID = UUID.randomUUID();
        entity.setId(randomUUID);
        users[cursor] = entity;
        cursor++;
        return randomUUID;
    }

    UserEntity findByID(UUID uuid) {
        for ( UserEntity entity : users ) {
            if (entity != null && entity.getId().equals(uuid)) {
                return entity;
            }
        }
        return null;
    }

    UserEntity findByName(String name) {
        for ( UserEntity entity : users ) {
            if (entity != null && entity.getName().equals(name)) {
                return entity;
            }
        }
        return null;
    }

    UserEntity[] findAll() {
        return users;
    }

    UserEntity updateUser(UUID uuid) {
        for ( UserEntity entity : users ) {
            if (entity.getId().equals(uuid)) {
                System.out.println("Enter new personal code of user " + entity.getId() + " :");
                entity.setPersonalCode(scanner.nextLine());
                System.out.println("Enter new name of user " + entity.getId() + " :");
                entity.setName(scanner.nextLine());
                System.out.println("Enter new family name of user " + entity.getId() + " :");
                entity.setFamilyName(scanner.nextLine());

            }
            {
                return entity;
            }
        }
        return null;
    }

    Object delete(UUID uuid) {
        for ( int i = 0; i < users.length; i++ ) {
            if (users[i] != null && users[i].getId().equals(uuid)) {
                users[i] = null;
                break;
            }
        }
        return null;
    }

}

