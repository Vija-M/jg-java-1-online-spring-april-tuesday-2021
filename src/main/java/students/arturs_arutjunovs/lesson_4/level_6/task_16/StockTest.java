package students.arturs_arutjunovs.lesson_4.level_6.task_16;

class StockTest {
    public static void main(String[] args) {

        StockTest stockTest = new StockTest();

        stockTest.testCaseExample();
        stockTest.testCase();
        stockTest.testCaseMax1();
        stockTest.testCaseMax2();
        stockTest.testCaseMax3();
    }

    void testCaseExample() {
        Stock google = new Stock("GOOG", 10);
        String priceInformation = google.getPriceInformation();
        System.out.println("Initial values:");
        System.out.println(priceInformation);

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        priceInformation = google.getPriceInformation();
        System.out.println("Current values:");
        System.out.println(priceInformation);

        assertStockTest(14, google.currentPrice, 7, google.minPrice, 15, google.maxPrice);
    }

    void testCase() {
        Stock google = new Stock("GOOG", 10);
        String priceInformation = google.getPriceInformation();
        System.out.println("Initial values:");
        System.out.println(priceInformation);

        google.updatePrice(12);
        google.updatePrice(5);
        google.updatePrice(7);
        google.updatePrice(99);
        google.updatePrice(77);

        priceInformation = google.getPriceInformation();
        System.out.println("Current values:");
        System.out.println(priceInformation);

        assertStockTest(77, google.currentPrice, 5, google.minPrice, 99, google.maxPrice);
    }

    void testCaseMax1() {
        Stock google = new Stock("GOOG", 999);
        String priceInformation = google.getPriceInformation();
        System.out.println("Initial values:");
        System.out.println(priceInformation);

        google.updatePrice(1);

        priceInformation = google.getPriceInformation();
        System.out.println("Current values:");
        System.out.println(priceInformation);

        assertStockTest(1, google.currentPrice, 1, google.minPrice, 999, google.maxPrice);
    }

    void testCaseMax2() {
        Stock google = new Stock("GOOG", 999);
        String priceInformation = google.getPriceInformation();
        System.out.println("Initial values:");
        System.out.println(priceInformation);

        google.updatePrice(2);
        google.updatePrice(1000);
        google.updatePrice(8);

        priceInformation = google.getPriceInformation();
        System.out.println("Current values:");
        System.out.println(priceInformation);

        assertStockTest(8, google.currentPrice, 2, google.minPrice, 1000, google.maxPrice);
    }

    void testCaseMax3() {
        Stock google = new Stock("GOOG", 9);
        String priceInformation = google.getPriceInformation();
        System.out.println("Initial values:");
        System.out.println(priceInformation);

        google.updatePrice(27);

        priceInformation = google.getPriceInformation();
        System.out.println("Current values:");
        System.out.println(priceInformation);

        assertStockTest(27, google.currentPrice, 9, google.minPrice, 27, google.maxPrice);
    }


    void assertStockTest(int expectedCurrentPrice, int actualCurrentPrice, int expectedMinPrice, int actualMinPrice, int expectedMaxPrice, int actualMaxPrice) {
        if (expectedCurrentPrice == actualCurrentPrice) {
            System.out.println("[TEST OK] Current price test (current price = " + expectedCurrentPrice + ")");
        } else {
            System.out.println("[FAIL] Current price test (current price = " + expectedCurrentPrice + ", Actual current price: " + actualCurrentPrice + ")");
        }
        if (expectedMinPrice == actualMinPrice) {
            System.out.println("[TEST OK] Minimal price test (minimal price = " + expectedMinPrice + ")");
        } else {
            System.out.println("[FAIL] Minimal price test (minimal price = " + expectedMinPrice + ", Actual minimal price: " + actualMinPrice + ")");
        }
        if (expectedMaxPrice == actualMaxPrice) {
            System.out.println("[TEST OK] Maximal price test (maximal price = " + expectedMaxPrice + ")");
        } else {
            System.out.println("[FAIL] Maximal price test (maximal price = " + expectedMaxPrice + ", Actual maximal price: " + actualMaxPrice + ")");
        }
        System.out.println("---------------------------------");
    }
}
