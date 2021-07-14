package instructor.lesson_12.exceptions.credentials;

class Credential {

    private final String username;
    private final String password;

    Credential(String username, String password) {
        if (username == null) {
            throw new IllegalArgumentException("Username cannot be null!");
        }

        if (password == null) {
            throw new IllegalArgumentException("Password cannot be null!");
        }

        if (password.length() < 6) {
            throw new TooShortPasswordException(6);
        }

        this.username = username;
        this.password = password;
    }

    String getUsername() {
        return username;
    }

    String getPassword() {
        return password;
    }

    String getMaskedPassword() {
        return password.replaceAll("[a-zA-Z]", "*");
    }

    @Override
    public String toString() {
        return "Credential{" +
                "username='" + username + '\'' +
                ", password='" + getMaskedPassword() + '\'' +
                '}';
    }
}
