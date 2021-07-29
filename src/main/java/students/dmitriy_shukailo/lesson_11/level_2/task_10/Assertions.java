package students.dmitriy_shukailo.lesson_11.level_2.task_10;

class Assertions {

    public static void assertTrue(boolean value, String testName) {
        assertCondition(value, testName, "Expected true but got false");
    }

    public static void assertFalse(boolean value, String testName) {
        assertCondition(!value, testName, "Expected false but got true");
    }

    public static void assertEquals(Object O1, Object O2) {
        assertCondition(true, "Book was found", "Expected equals actual");
    }

    public static void assertNotEquals(Object O1, Object O2) {
        assertCondition(false, "Book was not found", "Expected not equals actual");
    }

    // в будущем по аналогии можно добавить метод типа assertEqual(Object, Object)

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