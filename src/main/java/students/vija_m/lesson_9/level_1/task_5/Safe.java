package students.vija_m.lesson_9.level_1.task_5;

class Safe {
    private String password;
    private double moneyAmount;

    public Safe(String password, double moneyAmount) {
        this.password = password;
        this.moneyAmount = moneyAmount;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }

    public void putMoney(String password, double moneyAmount) {
        if (this.password.equals(password)) {
            this.moneyAmount += moneyAmount;
            System.out.println("You have " + this.moneyAmount + "$ in you safe");
        } else {
            System.out.println("Wrong password! Try again.");
        }
    }

    public void getMoney(String password, double moneyAmount) {
        if (this.password.equals(password) && moneyAmount <= this.moneyAmount) {
            this.moneyAmount -= moneyAmount;
            System.out.println("You have " + this.moneyAmount + "$ in you safe");
        } else if (this.password.equals(password) && moneyAmount > this.moneyAmount) {
            System.out.println("Not enough money in your safe. Please, try another amount.");
        } else {
            System.out.println("Wrong password! Try again.");
        }
    }
}
