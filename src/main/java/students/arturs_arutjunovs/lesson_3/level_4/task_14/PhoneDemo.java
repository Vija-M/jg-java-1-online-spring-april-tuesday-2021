package students.arturs_arutjunovs.lesson_3.level_4.task_14;

class Phone {

    String model;

    Phone(String newModel) {
        this.model = newModel;
    }

    String getModel() {
        return this.model;
    }

}

class PhoneDemo {
    public static void main(String[] args) {

        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }
}
