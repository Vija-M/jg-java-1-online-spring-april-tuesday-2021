package students.ernests_subhankulovs.lesson_4.level_7.task_20;

class LightColorDetectorTest {

    LightColorDetector lightColorDetector = new LightColorDetector();

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.testViolet();
        lightColorDetectorTest.testBlue();
        lightColorDetectorTest.testGreen();
        lightColorDetectorTest.testYellow();
        lightColorDetectorTest.testOrange();
        lightColorDetectorTest.testRed();
        lightColorDetectorTest.testInvisible();
    }
    public void testViolet() {
        lightColorDetectorAssert(405, "Violet", "LightColorDetector test - Violet");
    }
    public void testBlue() {
        lightColorDetectorAssert(475, "Blue", "LightColorDetector test - Blue");
    }
    public void testGreen() {
        lightColorDetectorAssert(505, "Green", "LightColorDetector test - Green");
    }
    public void testYellow() {
        lightColorDetectorAssert(585, "Yellow", "LightColorDetector test - Yellow");
    }
    public void testOrange() {
        lightColorDetectorAssert(619, "Orange", "LightColorDetector test - Orange");
    }
    public void testRed() {
        lightColorDetectorAssert(620, "Red", "LightColorDetector test - Red");
    }
    public void testInvisible() {
        lightColorDetectorAssert(760, "Invisible Light", "LightColorDetector test - Invisible Light");
    }

    public void lightColorDetectorAssert(int waveLength, String expectedResult, String testName) {
        String realResult = lightColorDetector.detect(waveLength);
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
