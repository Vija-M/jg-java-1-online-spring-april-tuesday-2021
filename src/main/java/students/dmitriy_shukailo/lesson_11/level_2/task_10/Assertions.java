package students.dmitriy_shukailo.lesson_11.level_2.task_10;

class Assertions {

    public static void assertTrue(boolean value, String testName) {
        assertCondition(value, testName, "Expected true but got false");
    }

    public static void assertFalse(boolean value, String testName) {
        assertCondition(!value, testName, "Expected false but got true");
    }

    public static void assertEquals(Object o1, Object o2, String testName) {
        assertCondition(o1.equals(o2),testName, "Expected " + o1 + "to be equal to" + o2);
    }

    public static void assertNotEquals(Object o1, Object o2, String testName) {
        assertCondition(!o1.equals(o2),testName, "Expected " + o1 + " to be not equal to " + o2);
    }

    // универсальный метод проверки условия и репорта об ошибке теста
    private static void assertCondition(boolean condition, String testName, String message) {
        if (condition) {
            System.out.println("Test '" + testName + "' PASSED!");
        } else {
            System.out.println("Test '" + testName + "' FAILED!");
            System.out.println("  - Reason: " + message);
        }
    }
}