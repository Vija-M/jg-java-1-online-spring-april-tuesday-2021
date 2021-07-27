package instructor.lesson_14.finterfaces;

import java.time.Clock;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Supplier;

class SupplierDemo {

    public static void main(String[] args) {

        RandomIntSupplier randomIntSupplier = new RandomIntSupplier(new Random());
        System.out.println("randomIntSupplier.get() = " + randomIntSupplier.get());

        LocalDateTimeSupplier localDateTimeSupplier = new LocalDateTimeSupplier(Clock.systemUTC());
        System.out.println("localDateTimeSupplier.get() = " + localDateTimeSupplier.get());

    }
}

class RandomIntSupplier implements Supplier<Integer> {

    private final Random random;

    RandomIntSupplier(Random random) {
        this.random = random;
    }

    @Override
    public Integer get() {
        return random.nextInt();
    }
}

class LocalDateTimeSupplier implements Supplier<LocalDateTime> {

    private final Clock clock;

    public LocalDateTimeSupplier(Clock clock) {
        this.clock = clock;
    }

    @Override
    public LocalDateTime get() {
        return LocalDateTime.now(clock);
    }
}
