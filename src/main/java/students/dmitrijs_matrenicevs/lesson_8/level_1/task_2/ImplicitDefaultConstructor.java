package students.dmitrijs_matrenicevs.lesson_8.level_1.task_2;

class ImplicitDefaultConstructor {

    String name;
    int age;
    String city;

    public ImplicitDefaultConstructor(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    void PrintInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
}
