package instructor.lesson_6;

class ForEachDemo {

    public static void main(String[] args) {
        String[] words = {
                "foo",
                "bar",
                "baz",
                "qux",
                "quux",
                "..."
        };

        System.out.println("For indexed:");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            System.out.println(word);
        }

        System.out.println();
        System.out.println("For each:");
        for (String word : words) {
            System.out.println(word);
        }

    }
}
