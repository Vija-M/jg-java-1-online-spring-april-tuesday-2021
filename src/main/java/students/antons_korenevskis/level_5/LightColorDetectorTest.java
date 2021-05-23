package students.antons_korenevskis.level_5;



class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.detectTest1();
        lightColorDetectorTest.detectTest2();
        lightColorDetectorTest.detectTest3();
        lightColorDetectorTest.detectTest4();
        lightColorDetectorTest.detectTest5();
        lightColorDetectorTest.detectTest6();
        lightColorDetectorTest.detectTest7();
        lightColorDetectorTest.detectTest8();
    }

    public void detectTest1() {
        int wavelength = 381;
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Light color test = OK");
        } else {
            System.out.println("Light color test = FAIL");
        }
    }

    public void detectTest2() {
        int wavelength = 490;
        String expectedResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Light color test = OK");
        } else {
            System.out.println("Light color test = FAIL");
        }
    }

    public void detectTest3() {
        int wavelength = 555;
        String expectedResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Light color test = OK");
        } else {
            System.out.println("Light color test = FAIL");
        }
    }

    public void detectTest4() {
        int wavelength = 573;
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Light color test = OK");
        } else {
            System.out.println("Light color test = FAIL");
        }
    }

    public void detectTest5() {
        int wavelength = 600;
        String expectedResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Light color test = OK");
        } else {
            System.out.println("Light color test = FAIL");
        }
    }

    public void detectTest6() {
        int wavelength = 666;
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Light color test = OK");
        } else {
            System.out.println("Light color test = FAIL");
        }
    }

    public void detectTest7() {
        int wavelength = 751;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Light color test = OK");
        } else {
            System.out.println("Light color test = FAIL");
        }
    }

    public void detectTest8() {
        int wavelength = 333;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult.equals(expectedResult)) {
            System.out.println("Light color test = OK");
        } else {
            System.out.println("Light color test = FAIL");
        }
    }
}