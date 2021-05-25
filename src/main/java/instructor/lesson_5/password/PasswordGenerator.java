package instructor.lesson_5.password;

import java.util.Random;

class PasswordGenerator {

    String generate(int length) {
        Random random = new Random();

        char[] password = new char[length];

        for (int i = 0; i < password.length; i++) {
            password[i] = (char) (48 + random.nextInt(123 - 48)); // 48 - 122
//            System.out.println((int) password[i]);
        }

        return new String(password);
    }
}
