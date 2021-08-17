package students.vija_m.lesson_12.level_2.task_7_8_9_10_11_12;

class BankClient {

    private String uid;      // уникальный идентификатор клиета
    private String fullName; // полное имя клиента

    BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    public String getUid() {
        return uid;
    }

    public String getFullName() {
        return fullName;
    }
}