package students.ernests_subhankulovs.lesson_12.level_3.task_18;

class NullPointerExceptionDemo {
    public static void main(String[] args) {
        DemoObject demoObject = null;
        System.out.println(demoObject.getId());
        //NullPointerException appears when accessing the field of a null object
    }
}
