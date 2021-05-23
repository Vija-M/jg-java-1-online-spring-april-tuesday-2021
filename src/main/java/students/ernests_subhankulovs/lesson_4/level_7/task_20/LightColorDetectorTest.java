package students.ernests_subhankulovs.lesson_4.level_7.task_20;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.testViolet(405, lightColorDetector);
        lightColorDetectorTest.testBlue(475, lightColorDetector);
        lightColorDetectorTest.testGreen(505, lightColorDetector);
        lightColorDetectorTest.testYellow(585, lightColorDetector);
        lightColorDetectorTest.testOrange(619, lightColorDetector);
        lightColorDetectorTest.testRed(620, lightColorDetector);
        lightColorDetectorTest.testInvisible(760, lightColorDetector);
    }
    public void testViolet(int waveLength, LightColorDetector lightColorDetector) {
        lightColorDetectorAssert(lightColorDetector, waveLength, "Violet", "LightColorDetector test - Violet");
    }
    public void testBlue(int waveLength, LightColorDetector lightColorDetector) {
        lightColorDetectorAssert(lightColorDetector, waveLength, "Blue", "LightColorDetector test - Blue");
    }
    public void testGreen(int waveLength, LightColorDetector lightColorDetector) {
        lightColorDetectorAssert(lightColorDetector, waveLength, "Green", "LightColorDetector test - Green");
    }
    public void testYellow(int waveLength, LightColorDetector lightColorDetector) {
        lightColorDetectorAssert(lightColorDetector, waveLength, "Yellow", "LightColorDetector test - Yellow");
    }
    public void testOrange(int waveLength, LightColorDetector lightColorDetector) {
        lightColorDetectorAssert(lightColorDetector,waveLength, "Orange", "LightColorDetector test - Orange");
    }
    public void testRed(int waveLength, LightColorDetector lightColorDetector) {
        lightColorDetectorAssert(lightColorDetector,waveLength, "Red", "LightColorDetector test - Red");
    }
    public void testInvisible(int waveLength, LightColorDetector lightColorDetector) {
        lightColorDetectorAssert(lightColorDetector, waveLength, "Invisible Light", "LightColorDetector test - Invisible Light");
    }

    public void lightColorDetectorAssert(LightColorDetector lightColorDetector, int waveLength, String expectedResult, String testName) {
        String realResult = lightColorDetector.detect(waveLength);
        if (realResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
