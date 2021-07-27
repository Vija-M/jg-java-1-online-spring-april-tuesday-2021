package instructor.lesson_14.finterfaces;

import java.util.function.Function;

class FunctionDemo {

    public static void main(String[] args) {

        SquareInt squareInt = new SquareInt();
        System.out.println("squareInt.apply(2) = " + squareInt.apply(2));
        System.out.println("squareInt.apply(5) = " + squareInt.apply(5));

        IntToString intToString = new IntToString();
        System.out.println("intToString.apply(1337) = " + intToString.apply(1337));

    }
}

class SquareInt implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer i) {
        return i * i;
    }
}

class IntToString implements Function<Integer, String> {

    @Override
    public String apply(Integer integer) {
        return integer.toString();
    }
}

