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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }
}

