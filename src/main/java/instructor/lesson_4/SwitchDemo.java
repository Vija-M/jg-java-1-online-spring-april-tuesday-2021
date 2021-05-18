package instructor.lesson_4;

class SwitchDemo {

    public static void main(String[] args) {

        String dayOfTheWeek = "monday";

        switch (dayOfTheWeek) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("Working day");
                break;
            case "saturday":
            case "sunday":
                System.out.println("Weekend!");
                break;
        }

        switch (dayOfTheWeek) {
            case "monday":
                System.out.println("Oh no, work again");
                break;
            case "tuesday":
                System.out.println("Yay, java courses");
                break;
            case "wednesday":
                System.out.println("Almost friday");
                break;
            case "thursday":
                System.out.println("One day to go");
                break;
            case "friday":
                System.out.println("Ice Hockey woohoo 🏒");
                break;
            case "saturday":
                System.out.println("Eurovision song contest yay 👨‍🎤");
                break;
            case "sunday":
                System.out.println("Oh no");
                break;
            default: // optional
                System.out.println("Something else");
        }

    }
}
