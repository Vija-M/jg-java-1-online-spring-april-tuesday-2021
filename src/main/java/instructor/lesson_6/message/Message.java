package instructor.lesson_6.message;

class Message {

    final static String WORD_PREFIX = ">>>";

    static int count;

    String text;

    public Message(String text) {
        this.text = text;
        count++;
    }
}
