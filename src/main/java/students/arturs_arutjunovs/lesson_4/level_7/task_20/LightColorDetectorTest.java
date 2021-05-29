package students.arturs_arutjunovs.lesson_4.level_7.task_20;

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
        assertLightColorDetector(405, "Violet", "LightColorDetector test - Violet");
    }

    public void testBlue() {
        assertLightColorDetector(475, "Blue", "LightColorDetector test - Blue");

    }

    public void testGreen() {
        assertLightColorDetector(505, "Green", "LightColorDetector test - Green");

    }

    public void testYellow() {
        assertLightColorDetector(585, "Yellow", "LightColorDetector test - Yellow");

    }

    public void testOrange() {
        assertLightColorDetector(619, "Orange", "LightColorDetector test - Orange");

    }

    public void testRed() {
        assertLightColorDetector(620, "Red", "LightColorDetector test - Red");

    }

    public void testInvisible() {
        assertLightColorDetector(760, "Invisible Light", "LightColorDetector test - Invisible");

    }

    void assertLightColorDetector(int wavelength, String expectedResult, String testName) {
        String actualResult = lightColorDetector.detect(wavelength);
        if (expectedResult.equals(actualResult)) {
            System.out.println("[TEST OK ]: " + testName);
        } else {
            System.out.println("[TEST FAILED]: " + testName + ". Expected " + expectedResult + ", but was " + actualResult);
        }
    }
}
