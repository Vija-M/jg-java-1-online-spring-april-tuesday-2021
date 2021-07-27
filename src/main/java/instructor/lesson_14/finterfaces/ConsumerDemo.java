package instructor.lesson_14.finterfaces;

import java.util.List;
import java.util.function.Consumer;

class ConsumerDemo {

    public static void main(String[] args) {

        PrintToConsoleConsumer printToConsoleConsumer = new PrintToConsoleConsumer();
        printToConsoleConsumer.accept(List.of("Hello", "JavaGuru", "World", "Hello"));

    }
}

class PrintToConsoleConsumer implements Consumer<List<String>> {

    @Override
    public void accept(List<String> strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
