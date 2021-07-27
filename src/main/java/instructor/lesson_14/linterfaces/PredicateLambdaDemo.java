package instructor.lesson_14.linterfaces;

import java.util.function.Predicate;

class PredicateLambdaDemo {

    public static void main(String[] args) {

        Predicate<Integer> evenIntPredicate = integer -> integer % 2 == 0;

        System.out.println("evenIntPredicate.test(4) = " + evenIntPredicate.test(4));
        System.out.println("evenIntPredicate.test(7) = " + evenIntPredicate.test(7));

    }
}

/*
class IsIntEven implements Predicate<Integer> {

    @Override
    public boolean test(Integer i) {
        return i % 2 == 0;
    }
}
 */