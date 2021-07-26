package instructor.lesson_10.immutability;

class PersonDemo {

    public static void main(String[] args) {

        final int foo = 5;

        final Address address = new Address("Latvia", "Riga", "Brivibas Iela");
        final Person person = new Person("John Doe", address);

        System.out.println(person);

    }
}
