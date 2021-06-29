package instructor.lesson_10.interfaces;

class InterfaceDemo {

    public static void main(String[] args) {

//        Singer[] singers = {
//                new Sting(),
//                new ElvisPresley()
//        };
//
//        for (Singer singer : singers) {
//            singer.sing();
//        }

        Sting sting = new Sting();
        ElvisPresley presley = new ElvisPresley();
        WhitneyHouston houston = new WhitneyHouston();

        actorsOnly(houston);

        singersOnly(sting);
        singersOnly(presley);
        singersOnly(houston);
    }

    static void actorsOnly(Actor actor) {
        System.out.println("The actor:");
        actor.act();
    }

    static void singersOnly(Singer singer) {
        System.out.println("The singer:");
        singer.sing();
    }
}
