package instructor.lesson_7.repository;

import java.util.UUID;

// CRUD
// C - Create
// R - Read
// U - Update
// D - Delete
class SongRepository {

    private SongEntity[] songs;
    private int cursor = 0;

    SongRepository() {
        songs = new SongEntity[100];
    }

    SongEntity[] findAll() {
        return songs;
    }

    SongEntity findById(UUID uuid) {
        for (SongEntity entity : songs) {
            if (entity.getId().equals(uuid)) {
                return entity;
            }
        }
        return null;
    }

    UUID save(SongEntity entity) {
        UUID randomUUID = UUID.randomUUID();

        entity.setId(randomUUID);

        songs[cursor] = entity;
        cursor++;

        return randomUUID;
    }

    void delete(UUID uuid) {
        for (int i = 0; i < songs.length; i++) {
            if (songs[i].getId().equals(uuid)) {
                songs[i] = null;
                break;
            }
        }
    }
}
