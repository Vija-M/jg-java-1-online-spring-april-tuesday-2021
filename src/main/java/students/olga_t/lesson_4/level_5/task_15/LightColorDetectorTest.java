package students.olga_t.lesson_4.level_5.task_15;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.lightColorDetectorTestRunner(5, "Invisible Light", 1);
        lightColorDetectorTest.lightColorDetectorTestRunner(1000, "Invisible Light", 2);
        lightColorDetectorTest.lightColorDetectorTestRunner(381, "Violet", 3);
        lightColorDetectorTest.lightColorDetectorTestRunner(459, "Blue", 4);
        lightColorDetectorTest.lightColorDetectorTestRunner(499, "Green", 5);
        lightColorDetectorTest.lightColorDetectorTestRunner(580, "Yellow", 6);
        lightColorDetectorTest.lightColorDetectorTestRunner(610, "Orange", 7);
        lightColorDetectorTest.lightColorDetectorTestRunner(740, "Red", 8);
    }


    public void lightColorDetectorTestRunner(int wavelength, String expectedResult, int testNumber) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Test " + testNumber + " OK");
        } else {
            System.out.println("Test " + testNumber + " FAIL");
        }
    }

}
