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

        System.out.println(" - Hello, Lady!");
        System.out.println("   What's your name?");
        System.out.println(" - " + nameOfThePerson);
        System.out.println(" - Are You cooking?");
        System.out.println(" - " + (this.cooking ? "Yes, I am!" : "Not at all!"));
    }

    void answer() {
        if (cooking) {System.out.print("");}
        else{System.out.println(" - You should try, it's fun!!!");
    }}

    void printInfo2() {

        System.out.println(" - Are You studying?");
        System.out.println(" - " + (this.studyingAtTheUniversity ? "Yes, I am!" : "Not at all!"));
    }

    void answer2() {
        if (studyingAtTheUniversity) {System.out.print("");}
        else{System.out.println(" - Try to study JAVA, then!!!");}
            System.out.println();
    }}
