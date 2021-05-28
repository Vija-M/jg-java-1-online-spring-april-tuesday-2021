package students.dmitrijs_matrenicevs.lesson_4.level_7.task_18;

class LeapYearTest {

    public static void main(String[] args) {

        LeapYearTest leapYearTest = new LeapYearTest();


    }

    void yearTestOne (){
        yearTestFinal ("100", 1876, true);
    }
    void yearTestTwo (){
        yearTestFinal ("4 и 400", 2500, true);
    }
    void yearTestThree (){
        yearTestFinal ("4", 1888, false);
    }
    void yearTestFour (){
        yearTestFinal ("4, 100, 400", 1700, false);
    }
}
