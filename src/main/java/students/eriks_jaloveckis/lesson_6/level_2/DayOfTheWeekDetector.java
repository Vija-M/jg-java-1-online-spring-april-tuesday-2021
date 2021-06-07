package students.eriks_jaloveckis.lesson_6.level_2;

import java.util.Scanner;

class DayOfTheWeekDetector {
    public int getDayNumberOfTheUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input day number between 1 and 7: ");
        return scanner.nextInt();
    }

    String findDayOfTheWeek(int dayNumber) {
        String weekString;
        switch (dayNumber) {
            case 1:
                weekString = "Monday";
                break;
            case 2:
                weekString = "Tuesday";
                break;
            case 3:
                weekString = "Wednesday";
                break;
            case 4:
                weekString = "Thursday";
                break;
            case 5:
                weekString = "Friday";
                break;
            case 6:
                weekString = "Saturday";
                break;
            case 7:
                weekString = "Sunday";
                break;
            default:
                weekString = " :( ";
                break;
        }
        return weekString;
    }
}
