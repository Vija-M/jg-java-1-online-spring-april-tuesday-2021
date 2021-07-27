package instructor.lesson_14.linterfaces;

import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

class ConsumerLambdaDemo {

    public static void main(String[] args) {

        Consumer<List<String>> printToConsoleConsumer = strings -> {
            for (String string : strings) {
                System.out.println(string);
            }
        };

        printToConsoleConsumer.accept(List.of("yet", "another", "lambda", "demo"));

    }
}
