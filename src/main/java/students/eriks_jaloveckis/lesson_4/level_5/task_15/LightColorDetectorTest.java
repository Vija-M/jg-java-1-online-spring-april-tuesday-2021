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

    public void violetColorHighTest(){
        int wavelength = 449;
        String color = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realColor = lightColorDetector.detect(wavelength);
        if (color == realColor){
            System.out.println(realColor + " - TEST OK");
        }
        else{
            System.out.println("TEST IS FAIL");
        }

    }
    public void violetColorLowTest(){
        int wavelength = 380;
        String color = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realColor = lightColorDetector.detect(wavelength);
        if (color == realColor){
            System.out.println(realColor + " - TEST OK");
        }
        else{
            System.out.println("TEST IS FAIL");
        }

    }
public void blueColorLowTest(){
    int wavelength = 450;
    String color = "Blue";
    LightColorDetector lightColorDetector = new LightColorDetector();
    String realColor = lightColorDetector.detect(wavelength);
        if (color == realColor){
        System.out.println(realColor + " - TEST OK");
    }
        else{
        System.out.println("TEST IS FAIL");
    }
}

public void blueColorHighTest(){
        int wavelength = 494;
        String color = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realColor = lightColorDetector.detect(wavelength);
        if (color == realColor){
                System.out.println(realColor + " - TEST OK");
            }
            else{
                System.out.println("TEST IS FAIL");
            }
}

public void greenColorLowTest(){
        int wavelength = 495;
        String color = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realColor = lightColorDetector.detect(wavelength);
    if (color == realColor){
        System.out.println(realColor + " - TEST OK");
    }
    else{
        System.out.println("TEST IS FAIL");
    }
}

public void greenColorHighTest(){
        int wavelength = 569;
        String color = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realColor = lightColorDetector.detect(wavelength);
    if (color == realColor){
        System.out.println(realColor + " - TEST OK");
    }
    else{
        System.out.println("TEST IS FAIL");
    }
}

public void yellowColorLowTest(){
        int wavelength = 570;
        String color = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realColor = lightColorDetector.detect(wavelength);
    if (color == realColor){
        System.out.println(realColor + " - TEST OK");
    }
    else{
        System.out.println("TEST IS FAIL");
    }
}

public void yellowColorHighTest(){
        int wavelength = 589;
        String color = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realColor = lightColorDetector.detect(wavelength);
        if (color == realColor){
        System.out.println(realColor + " - TEST OK");
    }
    else{
        System.out.println("TEST IS FAIL");
    }
}

public void orangeColorLowTest(){
        int wavelength = 590;
        String color = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realColor = lightColorDetector.detect(wavelength);
    if (color == realColor){
        System.out.println(realColor + " - TEST OK");
    }
    else{
        System.out.println("TEST IS FAIL");
    }
}

public void orangeColorHighTest (){
        int wavelength = 619;
        String color = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realColor = lightColorDetector.detect(wavelength);
    if (color == realColor){
        System.out.println(realColor + " - TEST OK");
    }
    else{
        System.out.println("TEST IS FAIL");
    }
}

public void redColorLowTest(){
        int wavelength = 620;
        String color = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realColor = lightColorDetector.detect(wavelength);
    if (color == realColor){
        System.out.println(realColor + " - TEST OK");
    }
    else{
        System.out.println("TEST IS FAIL");
    }
}

public void redColorHighTest(){
        int wavelength = 750;
        String color = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realColor = lightColorDetector.detect(wavelength);
    if (color == realColor){
        System.out.println(realColor + " - TEST OK");
    }
    else{
        System.out.println("TEST IS FAIL");
    }
}

public void invisibleLightColorTest(){
        int wavelength = 777;
        String color = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realColor = lightColorDetector.detect(wavelength);
    if (color == realColor){
        System.out.println(realColor + " - TEST OK");
    }
    else{
        System.out.println("TEST IS FAIL");
    }
}

}


