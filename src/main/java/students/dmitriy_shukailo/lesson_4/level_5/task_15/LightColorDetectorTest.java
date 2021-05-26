package students.dmitriy_shukailo.lesson_4.level_5.task_15;

class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violet();
        lightColorDetectorTest.blue();
        lightColorDetectorTest.green();
        lightColorDetectorTest.yellow();
        lightColorDetectorTest.orange();
        lightColorDetectorTest.red();
        lightColorDetectorTest.invisibleLightOne();
        lightColorDetectorTest.invisibleLightTwo();
    }

    public void violet() {
        LightColorDetector lightColorDetector = new LightColorDetector();

        int waveLength = 420;
        String expectedResult = "Violet";
        String actualResult = lightColorDetector.detect(waveLength);

        assertlightColorDetector(expectedResult, actualResult, "Detector test is Violet colour = ");
    }

    public void blue() {
        LightColorDetector lightColorDetector = new LightColorDetector();

        int waveLength = 470;
        String expectedResult = "Blue";
        String actualResult = lightColorDetector.detect(waveLength);

        assertlightColorDetector(expectedResult, actualResult, "Detector test is Blue colour = ");
    }

    public void green() {
        LightColorDetector lightColorDetector = new LightColorDetector();

        int waveLength = 550;
        String expectedResult = "Green";
        String actualResult = lightColorDetector.detect(waveLength);

        assertlightColorDetector(expectedResult, actualResult, "Detector test is Green colour = ");
    }

    public void yellow() {
        LightColorDetector lightColorDetector = new LightColorDetector();

        int waveLength = 580;
        String expectedResult = "Yellow";
        String actualResult = lightColorDetector.detect(waveLength);

        assertlightColorDetector(expectedResult, actualResult, "Detector test is Yellow colour = ");
    }

    public void orange() {
        LightColorDetector lightColorDetector = new LightColorDetector();

        int waveLength = 610;
        String expectedResult = "Orange";
        String actualResult = lightColorDetector.detect(waveLength);

        assertlightColorDetector(expectedResult, actualResult, "Detector test is Orange colour = ");
    }

    public void red() {
        LightColorDetector lightColorDetector = new LightColorDetector();

        int waveLength = 650;
        String expectedResult = "Red";
        String actualResult = lightColorDetector.detect(waveLength);

        assertlightColorDetector(expectedResult, actualResult, "Detector test is Red colour = ");
    }

    public void invisibleLightOne() {
        LightColorDetector lightColorDetector = new LightColorDetector();

        int waveLength = 350;
        String expectedResult = "Invisible Light";
        String actualResult = lightColorDetector.detect(waveLength);

        assertlightColorDetector(expectedResult, actualResult, "Detector test is Invisible Light UltraViolet colour = ");
    }

    public void invisibleLightTwo() {
        LightColorDetector lightColorDetector = new LightColorDetector();

        int waveLength = 850;
        String expectedResult = "Invisible Light";
        String actualResult = lightColorDetector.detect(waveLength);

        assertlightColorDetector(expectedResult, actualResult, "Detector test is Invisible Light InfraRed colour = ");
    }

    void assertlightColorDetector(String expectedResult, String realResult, String description) {
        if (expectedResult.equals(realResult)) {
            System.out.println(description + "OK");
        } else {
            System.out.println(description + "FAIL");
        }
    }
}