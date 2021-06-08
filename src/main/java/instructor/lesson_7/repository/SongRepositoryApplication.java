package instructor.lesson_7.repository;

import java.time.Duration;
import java.util.Arrays;
import java.util.UUID;

class SongRepositoryApplication {

    public static void main(String[] args) {

        SongRepository repository = new SongRepository();

        System.out.println("repository.findAll() = " + Arrays.toString(repository.findAll()));

        SongEntity song1 = new SongEntity();
        song1.setTitle("Cadillac");
        song1.setArtist("MORGENSHTERN");
        song1.setGenre("Rap");
        song1.setDuration(Duration.ofSeconds(205));

        SongEntity song2 = new SongEntity();
        song2.setTitle("Thriller");
        song2.setArtist("Michael Jackson");
        song2.setGenre("Pop");
        song2.setDuration(Duration.ofSeconds(240));

        SongEntity song3 = new SongEntity();
        song3.setTitle("Little Less Conversation");
        song3.setArtist("Elvis Presley");
        song3.setGenre("Rock'n'Roll");
        song3.setDuration(Duration.ofSeconds(160));


        UUID song1Id = repository.save(song1);
        UUID song2Id = repository.save(song2);
        UUID song3Id = repository.save(song3);

        System.out.println("repository.findAll() = " + Arrays.toString(repository.findAll()));

        SongEntity foundSong1 = repository.findById(song1Id);
        SongEntity foundSong2 = repository.findById(song2Id);
        SongEntity foundSong3 = repository.findById(song3Id);

        System.out.println("foundSong1.getTitle() = " + foundSong1.getTitle());
        System.out.println("foundSong2.getTitle() = " + foundSong2.getTitle());
        System.out.println("foundSong3.getTitle() = " + foundSong3.getTitle());

        repository.delete(song1Id);
        repository.delete(song2Id);
        repository.delete(song3Id);

        System.out.println("repository.findAll() = " + Arrays.toString(repository.findAll()));

    }
}
