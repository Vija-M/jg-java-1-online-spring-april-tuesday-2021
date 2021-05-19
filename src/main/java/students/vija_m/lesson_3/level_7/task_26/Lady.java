package students.vija_m.lesson_3.level_7.task_26;

class Lady {
    String name;
    String eyes;
    String hair;
    int age;
    boolean cooks;
    boolean studying;


    public Lady(String name, String eyes, String hair, int age, boolean cooks, boolean studying) {
        this.name = name;
        this.eyes = eyes;
        this.hair = hair;
        this.age = age;
        this.cooks = cooks;
        this.studying = studying;

    }

    void printInfo() {

        boolean cooks = true;
        String result = this.cooks ? "Yes!" : "No!";

        boolean studying = true;
        String result2 = this.studying ? "Yes!" : "No!";

        System.out.println("This is " + this.name + ". She is " + this.age + " years young lady with " + this.hair +
                " hair and " + this.eyes + " eyes.");
        System.out.println("Is she studying? - " + result);
        System.out.println("Is she cooking? - " + result2);
        System.out.println();

    }}
