package instructor.lesson_10.interfaces;

class WhitneyHouston implements Singer, Actor {

    @Override
    public void act() {
        System.out.println("Act: The Bodyguard");
    }

    @Override
    public void sing() {
        System.out.println("Sing: I Will Always Love You");
    }
}
