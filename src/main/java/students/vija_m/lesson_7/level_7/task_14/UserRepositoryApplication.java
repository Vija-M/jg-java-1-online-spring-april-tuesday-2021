package students.vija_m.lesson_7.level_7.task_14;

import java.util.Arrays;
import java.util.UUID;

class UserRepositoryApplication {

    public static void main(String[] args) {

        UserRepository repository = new UserRepository();

        System.out.println("repository.findAll() = " + Arrays.toString(repository.findAll()));

        UserEntity user1 = new UserEntity("John", "Doe", "000000-00000");
        UserEntity user2 = new UserEntity("John", "Smith", "000001-00000");
        UserEntity user3 = new UserEntity("Mary", "Green", "000002-00000");
        UserEntity user4 = new UserEntity("Alan", "Po", "000003-00000");
        UserEntity user5 = new UserEntity("John", "Chaney", "000004-00000");

        UUID user1Id = repository.save(user1);
        UUID user2Id = repository.save(user2);
        UUID user3Id = repository.save(user3);
        UUID user4Id = repository.save(user4);
        UUID user5Id = repository.save(user5);

        System.out.println("repository.findAll() = " + Arrays.toString(repository.findAll()));

        UserEntity foundUser1 = repository.findByID(user1Id);
        UserEntity foundUser2 = repository.findByID(user2Id);
        UserEntity foundUser3 = repository.findByID(user3Id);
        UserEntity foundUser4 = repository.findByID(user4Id);
        UserEntity foundUser5 = repository.findByID(user5Id);

        System.out.println("User1 ID is: " + foundUser1.getId());
        System.out.println("User1 personal code is: " + foundUser1.getPersonalCode());
        System.out.println("User1 name is: " + foundUser1.getFirstName());
        System.out.println("User1 family name is: " + foundUser1.getLastName());
        System.out.println("***");
        System.out.println("User2 ID is: " + foundUser2.getId());
        System.out.println("User2 personal code is: " + foundUser2.getPersonalCode());
        System.out.println("User2 name is: " + foundUser2.getFirstName());
        System.out.println("User2 family name is: " + foundUser2.getLastName());
        System.out.println("***");
        System.out.println("User3 ID is: " + foundUser3.getId());
        System.out.println("User3 personal code is: " + foundUser3.getPersonalCode());
        System.out.println("User3 name is: " + foundUser3.getFirstName());
        System.out.println("User3 family name is: " + foundUser3.getLastName());
        System.out.println("***");
        System.out.println("User4 ID is: " + foundUser4.getId());
        System.out.println("User4 personal code is: " + foundUser4.getPersonalCode());
        System.out.println("User4 name is: " + foundUser4.getFirstName());
        System.out.println("User4 family name is: " + foundUser4.getLastName());
        System.out.println("***");
        System.out.println("User5 ID is: " + foundUser5.getId());
        System.out.println("User5 personal code is: " + foundUser5.getPersonalCode());
        System.out.println("User5 name is: " + foundUser5.getFirstName());
        System.out.println("User5 family name is: " + foundUser5.getLastName());
        System.out.println("***");
        System.out.println("");

        UserEntity findAlan = repository.findByName("Alan");
        System.out.println("ID of Alan is: " + findAlan.getId());
        System.out.println("Personal code of Alan is: " + findAlan.getPersonalCode());
        System.out.println("Family name of Alan is: " + findAlan.getLastName());
        System.out.println("***");
        UserEntity findMary = repository.findByName("Mary");
        System.out.println("ID of Mary is: " + findMary.getId());
        System.out.println("Personal code of Mary is: " + findMary.getPersonalCode());
        System.out.println("Family name of Mary is: " + findMary.getLastName());
        System.out.println("***");
        System.out.println("");

        UserEntity updateUser1 = repository.updateUser(user1Id, "111111-11111", "Catrin", "Stark");
        System.out.println("User1 ID is: " + updateUser1.getId());
        System.out.println("User1 personal code is: " + updateUser1.getPersonalCode());
        System.out.println("User1 name is: " + updateUser1.getFirstName());
        System.out.println("User1 family name is: " + updateUser1.getLastName());
        System.out.println("***");

        repository.delete(user2Id);
        System.out.println("repository.findAll() = " + Arrays.toString(repository.findAll()));

    }
}
