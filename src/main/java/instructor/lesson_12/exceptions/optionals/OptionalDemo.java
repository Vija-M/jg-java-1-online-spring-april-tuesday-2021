package instructor.lesson_12.exceptions.optionals;

import java.util.Optional;

class OptionalDemo {

    public static void main(String[] args) {

        Optional<String> emptyOpt = Optional.empty();
        Optional<String> ofOpt = Optional.of("hello");
        Optional<Object> opt = Optional.ofNullable("null");

        // != null
        if (emptyOpt.isPresent()) {
            // do something if optional contains value
            String s1 = emptyOpt.get();
        }

        // == null
        if (emptyOpt.isEmpty()) {
            // do something if optional does not contain value
            String s2 = emptyOpt.get();
        }

    }
}
