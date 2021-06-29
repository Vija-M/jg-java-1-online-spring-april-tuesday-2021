package instructor.lesson_10.generics;

class Candy {

    String name;

    public Candy(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "name='" + name + '\'' +
                '}';
    }
}
