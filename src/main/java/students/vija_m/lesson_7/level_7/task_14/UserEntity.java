package students.vija_m.lesson_7.level_7.task_14;

import java.util.UUID;

class UserEntity {
    private UUID id;
    private String name;
    private String familyName;
    private String personalCode;

    public UserEntity(UUID id) {
            }

    UserEntity(UUID id, String name, String familyName, String personalCode) {
        this.id = id;
        this.name = name;
        this.familyName = familyName;
        this.personalCode = personalCode;
    }

    UUID getId() {
        return id;
    }

    String getName() {
        return name;
    }

    String getFamilyName() {
        return familyName;
    }

    String getPersonalCode() {
        return personalCode;
    }

    void setId(UUID id) {
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }

    void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }
}
