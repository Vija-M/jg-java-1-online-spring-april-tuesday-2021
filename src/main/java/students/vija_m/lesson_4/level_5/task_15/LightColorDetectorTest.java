package students.vija_m.lesson_4.level_5.task_15;

class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetTest();
        lightColorDetectorTest.blueTest();
        lightColorDetectorTest.greenTest();
        lightColorDetectorTest.yellowTest();
        lightColorDetectorTest.orangeTest();
        lightColorDetectorTest.redTest();
        lightColorDetectorTest.invisibleTest1();
        lightColorDetectorTest.invisibleTest2();
    }


    void violetTest() {
        LightColorDetector detector = new LightColorDetector();
        int wavelength = 400;
        String expected = "Violet";
        String actual = detector.detect(wavelength);

        if (expected == actual) {
            System.out.println("Violet colour detector test        = OK");
        } else {
            System.out.println("Violet colour detector test        = FAIL");
        }
    }

    void blueTest() {
        LightColorDetector detector = new LightColorDetector();
        int wavelength = 494;
        String expected = "Blue";
        String actual = detector.detect(wavelength);

        if (expected == actual) {
            System.out.println("Blue colour detector test          = OK");
        } else {
            System.out.println("Blue colour detector test          = FAIL");
        }
    }


    void greenTest() {
        LightColorDetector detector = new LightColorDetector();
        int wavelength = 500;
        String expected = "Green";
        String actual = detector.detect(wavelength);

        if (expected == actual) {
            System.out.println("Green colour detector test         = OK");
        } else {
            System.out.println("Green colour detector test         = FAIL");
        }
    }

    void yellowTest() {
        LightColorDetector detector = new LightColorDetector();
        int wavelength = 580;
        String expected = "Yellow";
        String actual = detector.detect(wavelength);

        if (expected == actual) {
            System.out.println("Yellow colour detector test        = OK");
        } else {
            System.out.println("Yellow colour detector test        = FAIL");
        }
    }


    void orangeTest() {
        LightColorDetector detector = new LightColorDetector();
        int wavelength = 600;
        String expected = "Orange";
        String actual = detector.detect(wavelength);

        if (expected == actual) {
            System.out.println("Orange colour detector test        = OK");
        } else {
            System.out.println("Orange colour detector test        = FAIL");
        }
    }


    void redTest() {
        LightColorDetector detector = new LightColorDetector();
        int wavelength = 700;
        String expected = "Red";
        String actual = detector.detect(wavelength);

        if (expected == actual) {
            System.out.println("Red colour detector test           = OK");
        } else {
            System.out.println("Red colour detector test           = FAIL");
        }
    }


    void invisibleTest1() {
        LightColorDetector detector = new LightColorDetector();
        int wavelength = 1;
        String expected = "Invisible Light";
        String actual = detector.detect(wavelength);

        if (expected == actual) {
            System.out.println("Invisible light detector test 1    = OK");
        } else {
            System.out.println("Invisible light detector test 1    = FAIL");
        }
    }

    void invisibleTest2() {
        LightColorDetector detector = new LightColorDetector();
        int wavelength = 924;
        String expected = "Invisible Light";
        String actual = detector.detect(wavelength);

        if (expected == actual) {
            System.out.println("Invisible light detector test 2    = OK");
        } else {
            System.out.println("Invisible light detector test 2    = FAIL");
        }
    }

}