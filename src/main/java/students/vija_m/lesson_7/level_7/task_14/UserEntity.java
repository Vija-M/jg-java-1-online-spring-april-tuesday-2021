package students.vija_m.lesson_7.level_7.task_14;

import java.util.UUID;

class UserEntity {
    private UUID id;
    private String firstName;
    private String lastName;
    private String personalCode;

    public UserEntity() {
    }

    UserEntity(String firstName, String lastName, String personalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalCode = personalCode;
    }

    UUID getId() {
        return id;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    String getPersonalCode() {
        return personalCode;
    }

    void setId(UUID id) {
        this.id = id;
    }

    void setName(String name) {
        this.firstName = name;
    }

    void setFamilyName(String familyName) {
        this.lastName = familyName;
    }

    void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }


}