package students.ernests_subhankulovs.lesson_10.level_7.task_26;

class SimpleListTest {
    public static void main(String[] args) {
        SimpleListTest test = new SimpleListTest();
        test.addElementTest();
        test.addElementAtBeginningTest();
        test.addElementAtEndTest();
        test.removeElementTest();
        test.removeElementFromBeginningTest();
        test.removeElementFromEndTest();
        test.reverseTest();
        test.resizeTest();
        test.subListExtractionTest();
    }

    public void addElementTest() {
        SimpleList<String> simpleList = new SimpleListImplementation<>();
        simpleList.addElementAtEnd("A");
        simpleList.addElementAtEnd("B");
        simpleList.addElementAtEnd("C");
        simpleList.addElementAtEnd("D");
        simpleList.addElement(2, "E");
        System.out.println(simpleList.toString());
        assertTestResult("A", simpleList.getElement(0), "Add element at a position test 1");
        assertTestResult("B", simpleList.getElement(1), "Add element at a position test 2");
        assertTestResult("E", simpleList.getElement(2), "Add element at a position test 3");
        assertTestResult("C", simpleList.getElement(3), "Add element at a position test 4");
        assertTestResult("D", simpleList.getElement(4), "Add element at a position test 5");
        assertNumericTestResult(5,simpleList.getLength(), "List length (after update) test");
    }

    public void addElementAtBeginningTest() {
        SimpleList<String> simpleList = new SimpleListImplementation<>();
        simpleList.addElementAtEnd("A");
        simpleList.addElementAtEnd("B");
        simpleList.addElementAtEnd("C");
        simpleList.addElementAtBeginning("D");
        System.out.println(simpleList.toString());
        assertTestResult("D", simpleList.getElement(0), "Add element at the beginning test 1");
        assertTestResult("A", simpleList.getElement(1), "Add element at the beginning test 2");
        assertTestResult("B", simpleList.getElement(2), "Add element at the beginning test 3");
        assertTestResult("C", simpleList.getElement(3), "Add element at the beginning test 4");
        assertNumericTestResult(4,simpleList.getLength(), "List length (after update) test");
    }

    public void addElementAtEndTest() {
        SimpleList<String> simpleList = new SimpleListImplementation<>();
        simpleList.addElementAtEnd("A");
        simpleList.addElementAtEnd("B");
        simpleList.addElementAtEnd("C");
        System.out.println(simpleList.toString());
        assertTestResult("A", simpleList.getElement(0), "Add element at the end test 1");
        assertTestResult("B", simpleList.getElement(1), "Add element at the end test 2");
        assertTestResult("C", simpleList.getElement(2), "Add element at the end test 3");
        assertNumericTestResult(3,simpleList.getLength(), "List length (after update) test");
    }

    public void removeElementTest() {
        SimpleList<String> simpleList = new SimpleListImplementation<>();
        simpleList.addElementAtEnd("A");
        simpleList.addElementAtEnd("B");
        simpleList.addElementAtEnd("C");
        simpleList.addElementAtEnd("D");
        simpleList.removeElement(2);
        System.out.println(simpleList.toString());
        assertTestResult("A", simpleList.getElement(0), "Remove element at a position test 1");
        assertTestResult("B", simpleList.getElement(1), "Remove element at a position test 2");
        assertTestResult("D", simpleList.getElement(2), "Remove element at a position test 3");
        assertNumericTestResult(3,simpleList.getLength(), "List length (after update) test");
    }

    public void removeElementFromBeginningTest() {
        SimpleList<String> simpleList = new SimpleListImplementation<>();
        simpleList.addElementAtEnd("A");
        simpleList.addElementAtEnd("B");
        simpleList.addElementAtEnd("C");
        simpleList.removeElementFromBeginning();
        System.out.println(simpleList.toString());
        assertTestResult("B", simpleList.getElement(0), "Remove element from beginning test 1");
        assertTestResult("C", simpleList.getElement(1), "Remove element from beginning test 2");
        assertNumericTestResult(2,simpleList.getLength(), "List length (after update) test");
    }

    public void removeElementFromEndTest() {
        SimpleList<String> simpleList = new SimpleListImplementation<>();
        simpleList.addElementAtEnd("A");
        simpleList.addElementAtEnd("B");
        simpleList.addElementAtEnd("C");
        simpleList.removeElementFromEnd();
        System.out.println(simpleList.toString());
        assertTestResult("A", simpleList.getElement(0), "Remove element from beginning test 1");
        assertTestResult("B", simpleList.getElement(1), "Remove element from beginning test 2");
        assertNumericTestResult(2,simpleList.getLength(), "List length (after update) test");
    }

    public void reverseTest() {
        SimpleList<String> simpleList = new SimpleListImplementation<>();
        simpleList.addElementAtEnd("A");
        simpleList.addElementAtEnd("B");
        simpleList.addElementAtEnd("C");
        simpleList.addElementAtEnd("D");
        SimpleList<String> reversedSimpleList = simpleList.reverseOrder();
        System.out.println(reversedSimpleList.toString());
        simpleList = reversedSimpleList;
        assertTestResult("D", simpleList.getElement(0), "Reverse list test 1");
        assertTestResult("C", simpleList.getElement(1), "Reverse list test 2");
        assertTestResult("B", simpleList.getElement(2), "Reverse list test 3");
        assertTestResult("A", simpleList.getElement(3), "Reverse list test 4");
        assertNumericTestResult(4,simpleList.getLength(), "List length (after update) test");
    }

    public void resizeTest() {
        SimpleList<String> simpleList = new SimpleListImplementation<>();
        simpleList.addElementAtEnd("A");
        simpleList.addElementAtEnd("B");
        simpleList.addElementAtEnd("C");
        simpleList.addElementAtEnd("D");
        simpleList.addElementAtEnd("E");
        simpleList.resize(2);
        System.out.println(simpleList.toString());
        assertTestResult("A", simpleList.getElement(0), "Resize list test 1");
        assertTestResult("B", simpleList.getElement(1), "Resize list test 2");
        assertNumericTestResult(2,simpleList.getLength(), "List length (after update) test");
        simpleList.resize(4);
        System.out.println(simpleList.toString());
    }

    public void subListExtractionTest() {
        SimpleList<String> simpleList = new SimpleListImplementation<>();
        simpleList.addElementAtEnd("A");
        simpleList.addElementAtEnd("B");
        simpleList.addElementAtEnd("C");
        simpleList.addElementAtEnd("D");
        simpleList.addElementAtEnd("E");
        SimpleList<String> simpleSubList = simpleList.extractSublist(2,3);
        System.out.println(simpleSubList.toString());
        simpleList = simpleSubList;
        assertTestResult("C", simpleList.getElement(0), "Sublist extraction test 1");
        assertTestResult("D", simpleList.getElement(1), "Sublist extraction test 2");
        assertNumericTestResult(2,simpleList.getLength(), "List length (after update) test");
    }

    private void assertTestResult(String expectedResult, String realResult, String testName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }

    private void assertNumericTestResult(int expectedResult, int realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " = OK");
        }
        else {
            System.out.println(testName + " = FAIL");
        }
    }
}
