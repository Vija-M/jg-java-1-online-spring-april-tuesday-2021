package students.dmitriy_shukailo.lesson_8.level_3.task_13;

class ClassArt extends Child {

    private int pupilId;

    ClassArt(String name, int age, int pupilId) {
        super(name,  age);
        this.pupilId = pupilId;
    }

    @Override
   void hobby() {
        if (pupilId == 0) {
            System.out.println("artist");
        } if (pupilId == 1) {
            System.out.println("musician");
        } else {
            System.out.println("dancer");
        }
    }
}
