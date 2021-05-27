package students.eriks_jaloveckis.lesson_4.level_5.task_15;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetColorLowTest();
        lightColorDetectorTest.violetColorHighTest();
        lightColorDetectorTest.blueColorLowTest();
        lightColorDetectorTest.blueColorHighTest();
        lightColorDetectorTest.greenColorLowTest();
        lightColorDetectorTest.greenColorHighTest();
        lightColorDetectorTest.yellowColorLowTest();
        lightColorDetectorTest.yellowColorHighTest();
        lightColorDetectorTest.orangeColorLowTest();
        lightColorDetectorTest.orangeColorHighTest();
        lightColorDetectorTest.redColorLowTest();
        lightColorDetectorTest.redColorHighTest();
        lightColorDetectorTest.invisibleLightColorTest();


    }

    public void assertThatEqual(int wavelength, String expected, String testName) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String actual = lightColorDetector.detect(wavelength);
        if (expected.equals(actual)) {
            System.out.println("TEST OK" + testName);
        } else {
            System.out.println("TEST FAIL" + testName);
        }
    }


    public void violetColorLowTest() {
        assertThatEqual(380, "Violet", "Violet");
    }


    public void violetColorHighTest() {
        assertThatEqual(449, "Violet", "Violet");
    }

    public void blueColorLowTest() {
        assertThatEqual(450, "Blue", "Blue");
    }


    public void blueColorHighTest() {
        assertThatEqual(494, "Blue", "Blue");
    }

    public void greenColorLowTest() {
        assertThatEqual(495, "Green", "Green");
    }

    public void greenColorHighTest() {
        assertThatEqual(569, "Green", "Green");
    }

    public void yellowColorLowTest() {
        assertThatEqual(570, "Yellow", "Yellow");
    }

    public void yellowColorHighTest() {
        assertThatEqual(589, "Yellow", "Yellow");
    }

    public void orangeColorLowTest() {
        assertThatEqual(590, "Orange", "Orange");
    }

    public void orangeColorHighTest() {
        assertThatEqual(619, "Orange", "Orange");
    }

    public void redColorLowTest() {
        assertThatEqual(620, "Red", "Red");
    }

    public void redColorHighTest() {
        assertThatEqual(750, "Red", "Red");
    }

    public void invisibleLightColorTest() {
        assertThatEqual(777, "Invisible Light", "Invisible Light");
    }
}


