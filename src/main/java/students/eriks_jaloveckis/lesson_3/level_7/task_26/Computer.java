package students.eriks_jaloveckis.lesson_3.level_7.task_26;

class Computer {
        String poweredOn;
        double version;
        String poweredOff;
        double update;


        Computer(double version, String poweredOn){
            this.version = version;
            this.poweredOn = poweredOn;
        }

        void info(){
            System.out.println("Version - " + version);
            System.out.println("Powered off or on - " + poweredOn);
        }

        void poweredOff(){
            this.poweredOn = poweredOff;
            System.out.println("Shut down!");
        }

        void update(){
            update = 2.13341;
            this.version = update;
            System.out.println("New version is - " + update);
        }
}
