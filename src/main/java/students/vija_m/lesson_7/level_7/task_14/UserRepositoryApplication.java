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
        user1.setName("John");
        user1.setFamilyName("Smith");
        user1.setPersonalCode("000001-00000");

        UserEntity user3 = new UserEntity();
        user1.setName("Mary");
        user1.setFamilyName("Green");
        user1.setPersonalCode("000002-00000");

        UserEntity user4 = new UserEntity();
        user1.setName("Alan");
        user1.setFamilyName("Po");
        user1.setPersonalCode("000003-00000");

        UserEntity user5 = new UserEntity();
        user1.setName("John");
        user1.setFamilyName("Chaney");
        user1.setPersonalCode("000003-00000");

        UUID user1Id = repository.save(user1);
        UUID user2Id = repository.save(user2);
        UUID user3Id = repository.save(user3);
        UUID user4Id = repository.save(user4);
        UUID user5Id = repository.save(user5);

        System.out.println("repository.findAll() = " + Arrays.toString(repository.findAll()));

        /*SongEntity foundSong1 = repository.findById(song1Id);
        SongEntity foundSong2 = repository.findById(song2Id);
        SongEntity foundSong3 = repository.findById(song3Id);

        System.out.println("foundSong1.getTitle() = " + foundSong1.getTitle());
        System.out.println("foundSong2.getTitle() = " + foundSong2.getTitle());
        System.out.println("foundSong3.getTitle() = " + foundSong3.getTitle());

        repository.delete(song1Id);
        repository.delete(song2Id);
        repository.delete(song3Id);

        System.out.println("repository.findAll() = " + Arrays.toString(repository.findAll()));

    }*/
}}
