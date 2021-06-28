package students.ernests_subhankulovs.lesson_9.level_1.task_5;

class Safe {
    private String password;
    private double money;

    public Safe(String password, double money) {
        this.password = password;
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void retrieveMoney(String password, double money) {
        if (this.password.equals(password)) {
            this.money -= money;
        }
        else {
            System.out.println("Wrong password! Access denied!");
        }
    }

    public void putMoney(String password, double money) {
        if (this.password.equals(password)) {
            this.money += money;
        }
        else {
            System.out.println("Wrong password! Access denied!");
        }
    }
}
