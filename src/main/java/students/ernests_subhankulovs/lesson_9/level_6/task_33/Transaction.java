package students.ernests_subhankulovs.lesson_9.level_6.task_33;

class Transaction {

    private Trader trader;
    private int amount;

    Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return  trader.toString() +
                "Amount: " + amount + "\n";
    }
}