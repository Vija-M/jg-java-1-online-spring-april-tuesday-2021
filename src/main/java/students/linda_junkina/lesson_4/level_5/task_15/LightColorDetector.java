package students.linda_junkina.lesson_4.level_5.task_15;

class LightColorDetector {

    public String detect(int wavelength) {
        String colour;
        if (wavelength >= 380 && wavelength <= 449) {
            return colour = "Violet";
        } else if (wavelength >= 450 && wavelength <= 494) {
            return colour = "Blue";
        } else if (wavelength >= 495 && wavelength <= 569) {
            return colour = "Green";
        } else if (wavelength >= 570 && wavelength <= 589) {
            return colour = "Yellow";
        } else if (wavelength >= 590 && wavelength <= 619) {
            return colour = "Orange";
        } else if (wavelength >= 620 && wavelength <= 750) {
            return colour = "Red";
        } else {
            return colour = "Invisible Light";
        }
    }

}
