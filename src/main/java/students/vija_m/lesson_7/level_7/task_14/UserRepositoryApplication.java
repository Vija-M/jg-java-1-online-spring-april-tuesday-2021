package students.vija_m.lesson_7.level_7.task_14;

import java.util.Arrays;
import java.util.UUID;

class UserRepositoryApplication {

    public static void main(String[] args) {

        UserRepository repository = new UserRepository();

        System.out.println("repository.findAll() = " + Arrays.toString(repository.findAll()));

        UserEntity user1 = new UserEntity();
        user1.setName("John");
        user1.setFamilyName("Doe");
        user1.setPersonalCode("000000-00000");

        UserEntity user2 = new UserEntity();
        user2.setName("John");
        user2.setFamilyName("Smith");
        user2.setPersonalCode("000001-00000");

        UserEntity user3 = new UserEntity();
        user3.setName("Mary");
        user3.setFamilyName("Green");
        user3.setPersonalCode("000002-00000");

        UserEntity user4 = new UserEntity();
        user4.setName("Alan");
        user4.setFamilyName("Po");
        user4.setPersonalCode("000003-00000");

        UserEntity user5 = new UserEntity();
        user5.setName("John");
        user5.setFamilyName("Chaney");
        user5.setPersonalCode("000004-00000");

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
        System.out.println("User1 name is: " + foundUser1.getName());
        System.out.println("User1 family name is: " + foundUser1.getFamilyName());
        System.out.println("***");
        System.out.println("User2 ID is: " + foundUser2.getId());
        System.out.println("User2 personal code is: " + foundUser2.getPersonalCode());
        System.out.println("User2 name is: " + foundUser2.getName());
        System.out.println("User2 family name is: " + foundUser2.getFamilyName());
        System.out.println("***");
        System.out.println("User3 ID is: " + foundUser3.getId());
        System.out.println("User3 personal code is: " + foundUser3.getPersonalCode());
        System.out.println("User3 name is: " + foundUser3.getName());
        System.out.println("User3 family name is: " + foundUser3.getFamilyName());
        System.out.println("***");
        System.out.println("User4 ID is: " + foundUser4.getId());
        System.out.println("User4 personal code is: " + foundUser4.getPersonalCode());
        System.out.println("User4 name is: " + foundUser4.getName());
        System.out.println("User4 family name is: " + foundUser4.getFamilyName());
        System.out.println("***");
        System.out.println("User5 ID is: " + foundUser5.getId());
        System.out.println("User5 personal code is: " + foundUser5.getPersonalCode());
        System.out.println("User5 name is: " + foundUser5.getName());
        System.out.println("User5 family name is: " + foundUser5.getFamilyName());
        System.out.println("***");
        System.out.println("");

        UserEntity findAlan = repository.findByName("Alan");
        System.out.println("ID of Alan is: " + findAlan.getId());
        System.out.println("Personal code of Alan is: " + findAlan.getPersonalCode());
        System.out.println("Family name of Alan is: " + findAlan.getFamilyName());
        System.out.println("***");
        UserEntity findMary = repository.findByName("Mary");
        System.out.println("ID of Mary is: " + findMary.getId());
        System.out.println("Personal code of Mary is: " + findMary.getPersonalCode());
        System.out.println("Family name of Mary is: " + findMary.getFamilyName());
        System.out.println("***");
        System.out.println("");

        UserEntity updateUser1 = repository.updateUser(user1Id);
        System.out.println("User1 ID is: " + updateUser1.getId());
        System.out.println("User1 personal code is: " + updateUser1.getPersonalCode());
        System.out.println("User1 name is: " + updateUser1.getName());
        System.out.println("User1 family name is: " + updateUser1.getFamilyName());
        System.out.println("***");

        repository.delete(user2Id);
        System.out.println("repository.findAll() = " + Arrays.toString(repository.findAll()));

    }
}
