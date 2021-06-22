package instructor.lesson_9.comparison;

class EqualityDemo {

    public static void main(String[] args) {

        // Pēc 100 gadiem Piebalgā

        Song song1 = new Song("Ballejam Negulam");
        Song song2 = song1;
        Song song3 = new Song("Ballejam Negulam");

        System.out.println("By reference:");
        System.out.println("(song1 == song1) = " + (song1 == song1));
        System.out.println("(song1 == song2) = " + (song1 == song2));
        System.out.println("(song1 == song3) = " + (song1 == song3));

        System.out.println();
        System.out.println("By value:");
        System.out.println("(song1.equals(song1)) = " + (song1.equals(song1)));
        System.out.println("(song1.equals(song2)) = " + (song1.equals(song2)));
        System.out.println("(song1.equals(song3)) = " + (song1.equals(song3)));

        System.out.println();
        System.out.println("Songs:");
        System.out.println(song1);
        System.out.println(song2);
        System.out.println(song3);

        String text1 = "FOO"; // new String("FOO");
        String text2 = "FOO";

        String s1 = new String("BAR");
        String s2 = new String("BAR");

    }
}
