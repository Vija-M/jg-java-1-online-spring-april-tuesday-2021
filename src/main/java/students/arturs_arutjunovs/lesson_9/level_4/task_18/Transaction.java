package students.arturs_arutjunovs.lesson_9.level_4.task_18;

class Transaction {

  private Trader trader;
  private int amount;

    public Trader getTrader() {
        return trader;
    }

    public int getAmount() {
        return amount;
    }

    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;


}
 }
