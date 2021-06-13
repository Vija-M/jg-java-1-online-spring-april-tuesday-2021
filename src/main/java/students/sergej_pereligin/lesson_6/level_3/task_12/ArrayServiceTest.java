package students.sergej_pereligin.lesson_6.level_3.task_12;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

        public void checkCondition (boolean condition, String testName){
            if (condition) {
                System.out.println(testName + "   Test is OK");
            } else {
                System.out.println(testName + "   Test is  not OK");
            } }

        public void test1(){
            ArrayService test=new ArrayService();
            boolean contain= test.contains(new int[]{1,2,-3,4,5},-3);
            checkCondition(contain== true,"Negative number");
    }
    public void test2(){
        ArrayService test=new ArrayService();
        boolean contain=test.contains(new int[]{1,2,-3,0}, 0);
        checkCondition(contain==true, "Find zero");
    }
    public void test3(){
        ArrayService test=new ArrayService();
        boolean contain=test.contains(new int[]{1,2,-3,0},1);
        checkCondition(contain==true,"Positive number");
    }
    public void test4(){
        ArrayService test=new ArrayService();
        boolean contain=test.contains(new int[]{1,2,3,0},4);
        checkCondition(contain==false,"Negative test");
    }



    }

