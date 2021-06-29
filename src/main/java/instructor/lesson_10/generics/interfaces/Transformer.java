package instructor.lesson_10.generics.interfaces;

interface Transformer<IN, OUT> {

    OUT transform(IN in);
}
