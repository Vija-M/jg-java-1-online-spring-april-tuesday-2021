package students.antons_korenevskis.lesson_3.level_5;

class Dog{


    String name;
    int age;

    Dog(String dogName,
        int dogAge) {
        this.name = dogName;
        this.age = dogAge;
    }

    void voice() {
        System.out.println(name + " " + name + " " + name);
        System.out.println(age);
    }

    public static void main(String[] args) {

    }

}

