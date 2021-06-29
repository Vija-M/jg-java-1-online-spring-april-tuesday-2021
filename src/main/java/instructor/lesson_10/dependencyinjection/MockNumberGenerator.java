package instructor.lesson_10.dependencyinjection;

class MockNumberGenerator implements NumberGenerator {

    private int numberToReturn;

    public MockNumberGenerator(int numberToReturn) {
        this.numberToReturn = numberToReturn;
    }

    @Override
    public int nextInt(int rightBound) {
        return numberToReturn;
    }
}
