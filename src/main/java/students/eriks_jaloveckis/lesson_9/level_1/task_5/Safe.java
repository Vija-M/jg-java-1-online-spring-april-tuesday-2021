package students.eriks_jaloveckis.lesson_9.level_1.task_5;
class Safe {
    private int passcode;
    private double money;

    public Safe(int passcode, double money) {
        this.passcode = passcode;
        this.money = money;
    }

    public int getPasscode() {
        return passcode;
    }

    public double getMoney() {
        return money;
    }

    public void getMoney(int passcode, double money) {
        if (this.passcode == passcode && this.money > money) {
            this.money -= money;
            System.out.println("Your balance is " + this.money);
        }
        else if (this.passcode == passcode && this.money < money) {
            System.out.println("Insufficient fund!");
            System.out.println("Balance - " + this.money);
        }
        else {
            System.out.println("Wrong PIN-CODE!");
        }
    }

    public void putMoney(int passcode, double money) {
        if (this.passcode == passcode) {
            this.money += money;
            System.out.println("Your balance is " + this.money);
        }
        else {
            System.out.println("Wrong PIN-CODE!");
        }
    }
}
