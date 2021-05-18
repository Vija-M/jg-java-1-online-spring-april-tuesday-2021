package students.vija_m.lesson_3.level_5.task_19;

class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void voice() {
        System.out.println("Dog's name is " + this.name +", dog's age - " + this.age +".");
               }

    void happyBirthday() {
        this.age = age+1;
        System.out.println("Happy Birthday, " + name + "!!! ");
    }

    }