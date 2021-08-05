package students.vija_m.lesson_7.level_7.task_13;

class UserEntity {

    private int id;
    private String name;
    private String familyName;
    private String personalCode;

    UserEntity(int id, String name, String familyName, String personalCode) {
        this.id = id;
        this.name = name;
        this.familyName = familyName;
        this.personalCode = personalCode;
    }

    int getId() {
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

    void setId(int id) {
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

