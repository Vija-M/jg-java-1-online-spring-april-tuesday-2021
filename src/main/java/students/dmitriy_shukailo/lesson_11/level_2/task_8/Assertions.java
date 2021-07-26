package students.dmitriy_shukailo.lesson_11.level_2.task_8;

class Assertions {

    public static void assertTrue(boolean value, String testName) {
        assertCondition(value, testName, "Expected true but got false");
    }

    public static void assertFalse(boolean value, String testName) {
        assertCondition(!value, testName, "Expected false but got true");
    }

    // в будущем по аналогии можно добавить метод типа assertEqual(Object, Object) 🤔

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