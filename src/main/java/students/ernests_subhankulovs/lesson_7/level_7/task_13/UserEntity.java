package students.ernests_subhankulovs.lesson_7.level_7.task_13;

import java.util.UUID;

class UserEntity {
    private UUID id;
    private String firstName;
    private String lastName;
    private String personalCode;

    public UserEntity(UUID id, String firstName, String lastName, String personalCode) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalCode = personalCode;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }
}
