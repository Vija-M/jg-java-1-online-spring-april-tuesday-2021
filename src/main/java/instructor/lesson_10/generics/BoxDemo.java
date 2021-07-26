package instructor.lesson_10.generics;

class BoxDemo {

    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello");
        System.out.println(stringBox);

        Box<Candy> candyBox = new Box<>();
        candyBox.setValue(new Candy("DEF"));
        System.out.println(candyBox);

        Box myBox = new Box();

        myBox.setValue("Hello World");
        myBox.setValue(12345);
        myBox.setValue(true);
        myBox.setValue(new Candy("ABC"));

        if (myBox.getValue() instanceof Candy) {
            Candy candy = (Candy) myBox.getValue();
            System.out.println("The value is Candy = " + candy);
        } else {
            System.out.println("Not a candy!");
        }

        System.out.println(myBox);

    }
}
