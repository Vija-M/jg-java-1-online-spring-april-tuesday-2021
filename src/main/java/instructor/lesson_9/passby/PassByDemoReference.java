package instructor.lesson_9.passby;

class PassByDemoReference {

    // Pass by value

    // a) s1 - Dolly, s2 - Molly
    // b) s1 - Dolly, s1 - Dolly
    // c) s1 - Molly, s2 - Molly
    // d) s1 - Molly, d2 - Dolly

    public static void main(String[] args) {

        Sheep sheep = new Sheep();
        sheep.setName("Dolly");

        System.out.println("s1 = " + sheep.getName()); // Dolly

        foo(sheep);

        System.out.println("s2 = " + sheep.getName()); // Molly

    }

    static void foo(Sheep sheep) {
        sheep.setName("Molly");

        System.out.println("s3 = " + sheep.getName()); // Molly

        sheep = new Sheep();
        sheep.setName("Freddie");

        System.out.println("s4 = " + sheep.getName()); // Freddie
    }
}
