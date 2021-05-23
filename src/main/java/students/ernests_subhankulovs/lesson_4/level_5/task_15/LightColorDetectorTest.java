package students.ernests_subhankulovs.lesson_4.level_5.task_15;

public class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.belowVioletTest();
        lightColorDetectorTest.violetLowestTest();
        lightColorDetectorTest.violetHighestTest();
        lightColorDetectorTest.blueLowestTest();
        lightColorDetectorTest.blueHighestTest();
        lightColorDetectorTest.greenLowestTest();
        lightColorDetectorTest.greenHighestTest();
        lightColorDetectorTest.yellowLowestTest();
        lightColorDetectorTest.yellowHighestTest();
        lightColorDetectorTest.orangeLowestTest();
        lightColorDetectorTest.orangeHighestTest();
        lightColorDetectorTest.redLowestTest();
        lightColorDetectorTest.redHighestTest();
        lightColorDetectorTest.aboveRedTest();
    }

    public void belowVioletTest() {
        lightColorDetectorAssert(379, "Invisible Light", "1");
    }

    public void violetLowestTest() {
        lightColorDetectorAssert(380, "Violet", "2");
    }

    public void violetHighestTest() {
        lightColorDetectorAssert(449, "Violet", "3");
    }

    public void blueLowestTest() {
        lightColorDetectorAssert(450, "Blue", "4");
    }

    public void blueHighestTest() {
        lightColorDetectorAssert(494, "Blue", "5");
    }

    public void greenLowestTest() {
        lightColorDetectorAssert(495, "Green", "6");
    }

    public void greenHighestTest() {
        lightColorDetectorAssert(569, "Green", "7");
    }

    public void yellowLowestTest() {
        lightColorDetectorAssert(570, "Yellow", "8");
    }

    public void yellowHighestTest() {
        lightColorDetectorAssert(589, "Yellow", "9");
    }

    public void orangeLowestTest() {
        lightColorDetectorAssert(590, "Orange", "10");
    }

    public void orangeHighestTest() {
        lightColorDetectorAssert(619, "Orange", "11");
    }

    public void redLowestTest() {
        lightColorDetectorAssert(620, "Red", "12");
    }

    public void redHighestTest() {
        lightColorDetectorAssert(750, "Red", "13");
    }

    public void aboveRedTest() {
        lightColorDetectorAssert(751, "Invisible Light", "14");
    }

    public void lightColorDetectorAssert(int waveLength, String expectedResult, String testNumber) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(waveLength);
        if (realResult.equals(expectedResult)) {
            System.out.println("lightColorDetector Test " + testNumber + " (Wave length = " + waveLength + "; Expected color = " + expectedResult + ") = OK");
        } else {
            System.out.println("lightColorDetector Test " + testNumber + " (Wave length = " + waveLength + "; Expected color = " + expectedResult + ") = FAIL; Actual color: " + realResult + ".");
        }
    }


}
