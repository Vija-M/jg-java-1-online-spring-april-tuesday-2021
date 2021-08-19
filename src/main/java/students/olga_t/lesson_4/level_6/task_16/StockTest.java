package students.olga_t.lesson_4.level_6.task_16;

class StockTest {
    public static void main(String[] args) {
        Stock stock = new Stock("BMW", 50);

        String priceInformation = stock.getPriceInformation();
        System.out.println(priceInformation);
        stock.updatePrice(10);
        stock.updatePrice(12);
        stock.updatePrice(5);
        stock.updatePrice(7);
        stock.updatePrice(99);
        stock.updatePrice(77);
        priceInformation = stock.getPriceInformation();
        System.out.println(priceInformation);
    }

}




