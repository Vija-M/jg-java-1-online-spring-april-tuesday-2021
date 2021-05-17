package instructor.lesson_3;

public class CovidTestDemo {

    public static void main(String[] args) {

        CovidTest myCovidTest = new CovidTest();
        myCovidTest.patient = "Arkadij";
        myCovidTest.positive = false;

        CovidTest yourCovidTest = new CovidTest();
        yourCovidTest.patient = "Ivan";
        yourCovidTest.positive = true;

    }
}
