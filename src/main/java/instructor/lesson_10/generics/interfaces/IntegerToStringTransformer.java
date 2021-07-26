package instructor.lesson_10.generics.interfaces;

class IntegerToStringTransformer implements Transformer<Integer, String> {

    @Override
    public String transform(Integer integer) {
        return integer.toString();
    }
}
