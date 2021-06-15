package students.ernests_subhankulovs.lesson_7.level_6.task_9;

class PalindromeTest {

    Palindrome palindrome = new Palindrome();

    public static void main(String[] args) {
        PalindromeTest test = new PalindromeTest();
        test.isPalindromeTest1();
        test.isPalindromeTest2();
        test.isPalindromeTest3();
        test.isNotPalindromeTest();
    }

    public void isPalindromeTest1() {
        assertTestResult(true, palindrome.isPalindrome("race car"), "\"race car\" is a palindrome");
    }

    public void isPalindromeTest2() {
        assertTestResult(true, palindrome.isPalindrome("sum summus mus"), "\"sum summus mus\" is a palindrome");
    }

    public void isPalindromeTest3() {
        assertTestResult(true, palindrome.isPalindrome("А роза упала на лапу Азора"), "\"А роза упала на лапу Азора\" is a palindrome");
    }

    public void isNotPalindromeTest() {
        assertTestResult(false, palindrome.isPalindrome("негативный сценарий"), "\"негативный сценарий\" is not a palindrome");
    }

    private void assertTestResult(boolean expectedResult, boolean realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }
}
