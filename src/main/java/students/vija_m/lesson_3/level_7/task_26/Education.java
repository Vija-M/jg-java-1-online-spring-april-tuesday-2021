package students.vija_m.lesson_3.level_7.task_26;

class Education {
String nameOfThePerson;
boolean cooking;
boolean studyingAtTheUniversity;


    public Education(String nameOfThePerson, boolean cooking, boolean studyingAtTheUniversity) {
        this.nameOfThePerson = nameOfThePerson;
        this.cooking = cooking;
        this.studyingAtTheUniversity = studyingAtTheUniversity;
    }
    void printInfo() {

        boolean cooking = true;
        String result = this.cooking ? "Yes, I am!" : "Not at all!";

        System.out.println(" - Hello, Lady!");
        System.out.println("   What's your name?");
        System.out.println(" - " + nameOfThePerson);
        System.out.println(" - Are You cooking?");
        System.out.println(" - " + result);
    }

    void answer() {
        if (cooking) {System.out.print("");}
        else{System.out.println(" - You should try, it's fun!!!");
    }}

    void printInfo2() {
        boolean studyingAtTheUniversity = true;
        String result2 = this.studyingAtTheUniversity ? "Yes, I am!" : "Not at all!";

        if (this.cooking = false) {System.out.println("");}
        System.out.println(" - Are You studying?");
        System.out.println(" - " + result2);
    }

    void answer2() {
        if (studyingAtTheUniversity) {System.out.print("");}
        else{System.out.println(" - Try to study JAVA, then!!!");}
            System.out.println();
    }}
