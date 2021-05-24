package students.arturs_arutjunovs.lesson_4.level_4.task_15;

public class LightColorDetectorTest {
    public static void main(String[] args) {

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.colorDetectorTest_scenario_1();
        lightColorDetectorTest.colorDetectorTest_scenario_2();
        lightColorDetectorTest.colorDetectorTest_scenario_3();
        lightColorDetectorTest.colorDetectorTest_scenario_4();
        lightColorDetectorTest.colorDetectorTest_scenario_5();
        lightColorDetectorTest.colorDetectorTest_scenario_6();
        lightColorDetectorTest.periodBelowZeroTest();
        lightColorDetectorTest.periodZeroValueTest();
        lightColorDetectorTest.startValueLengthTest();
        lightColorDetectorTest.endValueLengthTest();
    }

    //test for Violet color
    void colorDetectorTest_scenario_1() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 390;
        String expectedResult = "Violet";
        String actualResult = lightColorDetector.detect(waveLength);

        checkCorrectPeriod(expectedResult, actualResult, "colorDetectorTest_scenario_1");

    }

    //test for Blue color
    void colorDetectorTest_scenario_2() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 480;
        String expectedResult = "Blue";
        String actualResult = lightColorDetector.detect(waveLength);

        checkCorrectPeriod(expectedResult, actualResult, "colorDetectorTest_scenario_2");
    }

    //test for Green color
    void colorDetectorTest_scenario_3() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 550;
        String expectedResult = "Green";
        String actualResult = lightColorDetector.detect(waveLength);

        checkCorrectPeriod(expectedResult, actualResult, "colorDetectorTest_scenario_3");
    }

    //test for Yellow color
    void colorDetectorTest_scenario_4() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 580;
        String expectedResult = "Yellow";
        String actualResult = lightColorDetector.detect(waveLength);

        checkCorrectPeriod(expectedResult, actualResult, "colorDetectorTest_scenario_4");
    }

    //test for Orange color
    void colorDetectorTest_scenario_5() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 605;
        String expectedResult = "Orange";
        String actualResult = lightColorDetector.detect(waveLength);

        checkCorrectPeriod(expectedResult, actualResult, "colorDetectorTest_scenario_5");
    }

    //test for Red color
    void colorDetectorTest_scenario_6() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 710;
        String expectedResult = "Red";
        String actualResult = lightColorDetector.detect(waveLength);

        checkCorrectPeriod(expectedResult, actualResult, "colorDetectorTest_scenario_6");
    }

    //test for Start point
    void startValueLengthTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 380;
        String expectedResult = "Violet";
        String actualResult = lightColorDetector.detect(waveLength);

        checkCorrectPeriod(expectedResult, actualResult, "startValueLengthTest");
    }

    //test for End point
    void endValueLengthTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 750;
        String expectedResult = "Red";
        String actualResult = lightColorDetector.detect(waveLength);

        checkCorrectPeriod(expectedResult, actualResult, "endValueLengthTest");
    }

    //test for Incorrect data (negative value)
    void periodBelowZeroTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = -400;
        String expectedResult = "Invisible light";
        String actualResult = lightColorDetector.detect(waveLength);

        checkCorrectPeriod(expectedResult, actualResult, "periodBelowZeroTest");
    }

    //test for Zero value
    void periodZeroValueTest() {
        LightColorDetector lightColorDetector = new LightColorDetector();
        int waveLength = 0;
        String expectedResult = "Invisible light";
        String actualResult = lightColorDetector.detect(waveLength);

        checkCorrectPeriod(expectedResult, actualResult, "periodZeroValueTest");
    }

    void checkCorrectPeriod(String expectedResult, String actualResult, String description) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("[TEST OK ]: " + description);
        } else {
            System.out.println("[TEST FAILED]: " + description + ". Expected " + expectedResult + ", but was " + actualResult);
        }
    }
}
