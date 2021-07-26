package students.ernests_subhankulovs.lesson_8.level_6.task_30;

class Task30 {
    public static void main(String[] args) {
        printStrings("One");
        printStrings("One", "Two");
        printStrings("One", "Two", "Three");
    }

    static private void printStrings(String... strings) {
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println();
    }
}
