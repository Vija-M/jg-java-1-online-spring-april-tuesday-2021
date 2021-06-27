package students.dmitriy_shukailo.lesson_9.level_1.task_5;

class Safe {

    private final String password;
    private double amountMoney;

    public Safe(String password, double amountMoney) {
        this.password = password;
        this.amountMoney = amountMoney;
    }

    public double getAmountMoney() {
        return amountMoney;
    }

    public void receiveMoney(String password, double money) {
        if (password.equals(this.password)) {
            this.amountMoney -= money;
            System.out.println("Your balance is " + amountMoney);
        } else {
            System.out.println("You enter incorrect password!");
        }
    }

    public void putMoney(String password, double money) {
        if (password.equals(this.password)) {
            this.amountMoney += money;
            System.out.println("Your balance is " + amountMoney);
        } else {
            System.out.println("You enter incorrect password!");
        }
    }

}