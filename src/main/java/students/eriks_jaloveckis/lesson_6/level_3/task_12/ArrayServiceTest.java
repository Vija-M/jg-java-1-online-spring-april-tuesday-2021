package students.eriks_jaloveckis.lesson_6.level_3.task_12;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.positiveNumberIn();
        arrayServiceTest.positiveNumberOut();
        arrayServiceTest.negativeNumberIn();
        arrayServiceTest.negativeNumberOut();

    }
    public void checkTestResult(boolean condition, String testName){
        if (condition){
            System.out.println(testName + " OK!");
        }
        else {
            System.out.println(testName + " FAIL!");
        }
    }

    public void positiveNumberIn(){
        ArrayService arrayService = new ArrayService();
        boolean contains = arrayService.contains(new int[]{1,2,3,4,5}, 2);
        checkTestResult(contains, "Contain positive number");
    }
    public void positiveNumberOut(){
        ArrayService arrayService = new ArrayService();
        boolean contains = arrayService.contains(new int[]{1,2,3,4,5}, 6);
        checkTestResult(contains == false, "Does not contain positive number");
    }
    public void negativeNumberIn(){
        ArrayService arrayService = new ArrayService();
        boolean contains = arrayService.contains(new int[]{1,2,3,4,-5}, -5);
        checkTestResult(contains, "Contain negative number");
    }
    public void negativeNumberOut(){
        ArrayService arrayService = new ArrayService();
        boolean contains = arrayService.contains(new int[]{1,2,3,4,5}, -3);
        checkTestResult(contains == false, "Does not contain negative number");

    }

}


