package instructor.lesson_14.linterfaces;

import java.util.function.Supplier;

class SupplierLambdaDemo {

    public static void main(String[] args) {

        /*
        Supplier<Throwable> throwableSupplier = new Supplier<Throwable>() {
            @Override
            public Throwable get() {
                throw new IllegalStateException("Throwable Supplier Demo");
            }
        };
         */

        Supplier<Throwable> throwableSupplier = () -> {
            throw new IllegalStateException("Throwable Supplier Demo");
        };

        System.out.println("Before get");

        throwableSupplier.get();

        System.out.println("After get");

    }
}
