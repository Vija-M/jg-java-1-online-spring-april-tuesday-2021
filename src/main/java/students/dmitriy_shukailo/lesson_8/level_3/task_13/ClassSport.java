package students.dmitriy_shukailo.lesson_8.level_3.task_13;

class ClassSport extends Child {

    private int pupilId;

    ClassSport(String name, int age, int pupilId) {
        super(name,  age);
        this.pupilId = pupilId;
    }

    @Override
   void hobby() {
        if (pupilId == 0) {
            System.out.println("football");
        } if (pupilId == 1) {
            System.out.println("volleyball");
        } else {
            System.out.println("hockey");
        }
    }
}
