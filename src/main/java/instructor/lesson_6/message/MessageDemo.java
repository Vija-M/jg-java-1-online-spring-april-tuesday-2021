package instructor.lesson_6.message;

class MessageDemo {

    public static void main(String[] args) {

        System.out.println("count = " + Message.count);

        Message message1 = new Message("1");
        Message message2 = new Message("2");
        Message message3 = new Message("3");
        Message message4 = new Message("4");
        Message message5 = new Message("5");
        Message message6 = new Message("6");

        System.out.println("count = " + Message.count);

    }
}
