package instructor.lesson_14.finterfaces;

import java.util.function.Predicate;

class PredicateDemo {

    public static void main(String[] args) {

        IsIntEven isIntEven = new IsIntEven();

        System.out.println("isIntEven.test(5) = " + isIntEven.test(5));
        System.out.println("isIntEven.test(6) = " + isIntEven.test(6));

        EmptyStringPredicate emptyStringPredicate = new EmptyStringPredicate();
        System.out.println("emptyStringPredicate.test(\"foo\") = " + emptyStringPredicate.test("foo"));
        System.out.println("emptyStringPredicate.test(\"\") = " + emptyStringPredicate.test(""));

    }
}

class IsIntEven implements Predicate<Integer> {

    @Override
    public boolean test(Integer i) {
        return i % 2 == 0;
    }
}

class EmptyStringPredicate implements Predicate<String> {

    @Override
    public boolean test(String s) {
        return s.isEmpty();
    }
}
