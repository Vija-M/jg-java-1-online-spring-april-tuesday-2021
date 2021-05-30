package students.vija_m.lesson_4.level_7.task_20;

class LightColorDetectorTest {
    LightColorDetector lightColorDetector = new LightColorDetector();

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetector = new LightColorDetectorTest();
        lightColorDetector.testViolet();
        lightColorDetector.testBlue();
        lightColorDetector.testGreen();
        lightColorDetector.testYellow();
        lightColorDetector.testOrange();
        lightColorDetector.testRed();
        lightColorDetector.testInvisible();
    }

    public void testViolet() {
        newColorTest(405, "Violet", "testViolet");
    }

    public void testBlue() {
        newColorTest(475, "Blue", "testBlue");
    }

    public void testGreen() {
        newColorTest(505, "Green", "testGreen");
    }

    public void testYellow() {
        newColorTest(585, "Yellow", "testYellow");
    }

    public void testOrange() {
        newColorTest(619, "Orange", "testOrange");
    }

    public void testRed() {
        newColorTest(620, "Red", "testRed");
    }

    public void testInvisible() {
        newColorTest(760, "Invisible Light", "testInvisible");
    }

    void newColorTest(int wavelength, String expected, String testName) {
        String result = lightColorDetector.detect(wavelength);
        if (result.equals(expected)) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }


}
