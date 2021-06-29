package students.linda_junkina.lesson_9.level_1.task_5;

class Safe {
    private String pin;
    private double money;

    public Safe(String pin, double money) {
        this.pin = pin;
        this.money = money;
    }

    public String getPin() {
        return pin;
    }

    public double getMoney() {
        return money;
    }

    public void getMoney(String pin, double money) {
        if (this.pin.equals(pin) && money <= this.money) {
            this.money -= money;
            System.out.println("Here is your money: " + money + "$");
            System.out.println(this.money + "$ left in safe");
        } else if (this.pin.equals(pin) && money > this.money) {
            System.out.println("Insufficient fund. You only have " + this.money + "$ in your safe");
        } else {
            System.out.println("Incorrect password. Try again.");
        }
    }

    public void putMoney(String pin, double money) {
        if (this.pin.equals(pin)) {
            this.money += money;
            System.out.println("Current amount of money in you safe is: " + this.money + "$");
        } else {
            System.out.println("Incorrect password. Try again.");
        }
    }
}