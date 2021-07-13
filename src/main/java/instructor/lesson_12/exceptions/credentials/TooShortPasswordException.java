package instructor.lesson_12.exceptions.credentials;

class TooShortPasswordException extends RuntimeException {

    public TooShortPasswordException(int threshold) {
        super("The password length is less than " + threshold + " symbols");
    }
}
