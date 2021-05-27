package students.linda_junkina.lesson_4.level_5.task_15;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColourDetectorTest = new LightColorDetectorTest();
        lightColourDetectorTest.detect();
    }

    public void detect() {
        int wavelength = 800;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Detect test = OK");
        } else {
            System.out.println("Detect test = FAIL");
        }
    }
}
