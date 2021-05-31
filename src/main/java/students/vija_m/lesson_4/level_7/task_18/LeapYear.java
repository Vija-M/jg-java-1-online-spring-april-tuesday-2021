package students.vija_m.lesson_4.level_7.task_18;

class LeapYear {
    public boolean isLeapYear(int year) {
        if (( year % 400 == 0 ) || ( year % 4 == 0 && year % 100 != 0 )) {
            return true;

        } else {
            return false;
        }
    }
}
