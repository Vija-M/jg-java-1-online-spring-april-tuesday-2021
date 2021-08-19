package students.vladimir_aboltins.lesson_3.level_5.task_17;

class Dog {
    String dogName;
    boolean dogVoice;


    Dog(String dogName, boolean dogVoice) {
        this.dogName = dogName;
        this.dogVoice = dogVoice;
    }


    void voice() {
        if (this.dogVoice != false) {
            for (int counter = 0; counter != 3; counter++)
                System.out.println(this.dogName);
        } else System.out.println("Try voice command");
    }

}



