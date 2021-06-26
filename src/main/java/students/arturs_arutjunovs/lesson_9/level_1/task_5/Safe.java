package students.arturs_arutjunovs.lesson_9.level_1.task_5;

class Safe {

    private String password;
    private int moneyBalance;

    public Safe() {
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMoneyBalance() {
        return moneyBalance;
    }

    public void setMoneyBalance(int moneyBalance) {
        this.moneyBalance = moneyBalance;
    }

    public void getMoney(int money, String password) {
        if (password.equals(this.password)) {
            this.moneyBalance -= money;
            System.out.println("You took 300$, left on balance: " + getMoneyBalance());
        } else {
            System.out.println("Wrong password to get money");
        }
    }

    public void putMoney(int money, String password) {
        if (password.equals(this.password)) {
            this.moneyBalance += money;
            System.out.println("You put 700$, now balance is: " + getMoneyBalance());
        } else {
            System.out.println("Wrong password to put money");
        }
    }
}

class safeDemo {
    public static void main(String[] args) {

        Safe safe = new Safe();

        safe.setMoneyBalance(5000);
        safe.setPassword("gYtR");
        System.out.println("Your safe balance is: " + safe.getMoneyBalance());

        safe.getMoney(300, "gYtR");
        safe.putMoney(700, "gYtR");


    }
}
