package instructor.lesson_12.exceptions.credentials;

class CredentialDemo {

    public static void main(String[] args) {

        Credential credential = new Credential("john.doe", "qwer");
        System.out.println("credential = " + credential);
        System.out.println("credential.getMaskedPassword() = " + credential.getMaskedPassword());

    }
}
