package instructor.lesson_5.password;

class PasswordGeneratorApplication {

    public static void main(String[] args) {

        PasswordGenerator passwordGenerator = new PasswordGenerator();
        System.out.println(passwordGenerator.generate(25));
    }
}
