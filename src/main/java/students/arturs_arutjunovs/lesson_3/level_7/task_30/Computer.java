package students.arturs_arutjunovs.lesson_3.level_7.task_30;

class Computer {

    String manufacturer;
    String model;

    String getManufacturer() {
        return manufacturer;
    }

    String getModel() {
        return model;
    }

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;

    }
}


class ComputerDemo {
    public static void main(String[] args) {

        Computer dell = new Computer("Dell", "XXX-1");
        String manufacturer = dell.getManufacturer();
        String model = dell.getModel();
        System.out.println("Computer manufacturer = " + manufacturer);
        System.out.println("Computer model = " + model);
    }
}