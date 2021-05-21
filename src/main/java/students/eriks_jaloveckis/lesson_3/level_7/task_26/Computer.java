package students.eriks_jaloveckis.lesson_3.level_7.task_26;

class Computer {

        double version;
        boolean powered;



        Computer(double version, boolean powered){
            this.version = version;
            this.powered = true;
        }

        void info(){
            System.out.println("Version - " + version);
            System.out.println("Powered on");
        }

        void powerOff(){
            this.powered = false;
            System.out.println("Shut down!");
        }

        void update(){
            this.version = 3.3221;
            System.out.println("New version is - " + version);
        }
}
