package students.jevgenij_leshkevich.lesson_3.level_4.task_14;

class Phone {

    String model; // убрал {

        Phone(String getModel) { // исправил Book->Phone, исправил newModel->getModel
            this.model = getModel; // исправил newModel->getModel
        }

        String getModel() {
            return this.model;
        }


}
