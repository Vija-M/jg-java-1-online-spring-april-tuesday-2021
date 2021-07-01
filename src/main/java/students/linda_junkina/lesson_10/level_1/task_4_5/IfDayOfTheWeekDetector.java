package students.linda_junkina.lesson_10.level_1.task_4_5;

import java.util.Scanner;

class IfDayOfTheWeekDetector implements DayOfTheWeekDetector {

    public String detectDayName(int number) {

//        if (number == 1) {
//            return "Monday";
//        } else if (number == 2) {
//            return "Tuesday";
//        } else if (number == 3) {
//            return "Wednesday";
//        } else if (number == 4) {
//            return "Thursday";
//        } else if (number == 5) {
//            return "Friday";
//        } else if (number == 6) {
//            return "Saturday";
//        } else if (number == 7) {
//            return "Sunday";
//        } else {
//            return "Please input a valid number between 1 and 7";
//        }


        return switch (number) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Please input a valid number between 1 and 7";
        };


//        int i = 0;
//        String[] dayOfTheWeek = {
//                "Monday",
//                "Tuesday",
//                "Wednesday",
//                "Thursday",
//                "Friday",
//                "Saturday",
//                "Sunday"
//        };
//        for (String day : dayOfTheWeek) {
//            if (i >= 0 && i < 7){
//            }
//        }
    }
}
