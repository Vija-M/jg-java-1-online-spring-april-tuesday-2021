package students.dmitrijs_matrenicevs.lesson_4.level_7.task_20;

class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();

        lightColorDetectorTest.invisibleLight();
        lightColorDetectorTest.colorTestViolet();
        lightColorDetectorTest.colorTestVioletTwo();
        lightColorDetectorTest.colorTestBlue();
        lightColorDetectorTest.colorTestBlueTwo();
        lightColorDetectorTest.colorTestGreen();
        lightColorDetectorTest.colorTestGreenTwo();
        lightColorDetectorTest.colorTestYellow();
        lightColorDetectorTest.colorTestYellowTwo();
        lightColorDetectorTest.colorTestOrange();
        lightColorDetectorTest.colorTestOrangeTwo();
        lightColorDetectorTest.colorTestRed();
        lightColorDetectorTest.colorTestRedTwo();
        lightColorDetectorTest.invisibleLightTwo();
    }

    void invisibleLight() {

        lightColorDetectorColorTest(379, "Invisible Light");
    }


    void invisibleLightTwo() {
        lightColorDetectorColorTest(751, "Invisible Light");
    }

    //Фиолетовый

    void colorTestViolet() {

        lightColorDetectorColorTest(380, "Violet");

    }

    void colorTestVioletTwo() {

        lightColorDetectorColorTest(449, "Violet");

    }

    //Синий

    void colorTestBlue() {

        lightColorDetectorColorTest(450, "Blue");

    }

    void colorTestBlueTwo() {

        lightColorDetectorColorTest(494, "Blue");

    }

    //Зеленый

    void colorTestGreen() {

        lightColorDetectorColorTest(495, "Green");

    }

    void colorTestGreenTwo() {

        lightColorDetectorColorTest(569, "Green");

    }

    //Жёлтый

    void colorTestYellow() {

        lightColorDetectorColorTest(570, "Yellow");

    }

    void colorTestYellowTwo() {

        lightColorDetectorColorTest(589, "Yellow");

    }

    //Оранжевый

    void colorTestOrange() {

        lightColorDetectorColorTest(590, "Orange");

    }

    void colorTestOrangeTwo() {

        lightColorDetectorColorTest(619, "Orange");

    }

    //Красный

    void colorTestRed() {

        lightColorDetectorColorTest(620, "Red");

    }

    void colorTestRedTwo() {

        lightColorDetectorColorTest(750, "Red");

    }


    void lightColorDetectorColorTest(int wavelength, String expectedResult) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (expectedResult.equals(realResult)) {
            System.out.println(wavelength + " " + expectedResult + " = OK");
        } else {

            System.out.println(wavelength + " " + expectedResult + " = FAIL");
        }
    }

}
