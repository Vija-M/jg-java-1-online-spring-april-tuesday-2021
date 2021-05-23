package students.ernests_subhankulovs.lesson_4.level_6.task_16;

class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.mainTestCase();
        stockTest.maxTestCase1();
        stockTest.maxTestCase2();
        stockTest.maxTestCase3();
        stockTest.exampleTestCase();
    }

    public void mainTestCase() {
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

        stockTestAssert(77, google.currentPrice, 5, google.minimalPrice, 99, google.maximalPrice);
    }

    public void maxTestCase1() {
        Stock google = new Stock("GOOG", 999);
        String priceInformation = google.getPriceInformation();
        System.out.println("Initial values:");
        System.out.println(priceInformation);

        google.updatePrice(1);

        priceInformation = google.getPriceInformation();
        System.out.println("Current values:");
        System.out.println(priceInformation);

        stockTestAssert(1, google.currentPrice, 1, google.minimalPrice, 999, google.maximalPrice);
    }

    public void maxTestCase2() {
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

        stockTestAssert(8, google.currentPrice, 2, google.minimalPrice, 1000, google.maximalPrice);
    }

    public void maxTestCase3() {
        Stock google = new Stock("GOOG", 9);
        String priceInformation = google.getPriceInformation();
        System.out.println("Initial values:");
        System.out.println(priceInformation);

        google.updatePrice(27);

        priceInformation = google.getPriceInformation();
        System.out.println("Current values:");
        System.out.println(priceInformation);

        stockTestAssert(27, google.currentPrice, 9, google.minimalPrice, 27, google.maximalPrice);
    }

    public void exampleTestCase() {
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

        stockTestAssert(14, google.currentPrice, 7, google.minimalPrice, 15, google.maximalPrice);
    }

    public void stockTestAssert(int expectedCurrentPrice, int actualCurrentPrice, int expectedMinPrice, int actualMinPrice, int expectedMaxPrice, int actualMaxPrice) {
        if (expectedCurrentPrice == actualCurrentPrice) {
            System.out.println("Current price test (current price = " + expectedCurrentPrice + ") = OK");
        } else {
            System.out.println("Current price test (current price = " + expectedCurrentPrice + ") = FAIL; Actual current price: " + actualCurrentPrice + ".");
        }
        if (expectedMinPrice == actualMinPrice) {
            System.out.println("Minimal price test (minimal price = " + expectedMinPrice + ") = OK");
        } else {
            System.out.println("Minimal price test (minimal price = " + expectedMinPrice + ") = FAIL; Actual minimal price: " + actualMinPrice + ".");
        }
        if (expectedMaxPrice == actualMaxPrice) {
            System.out.println("Maximal price test (maximal price = " + expectedMaxPrice + ") = OK");
        } else {
            System.out.println("Maximal price test (maximal price = " + expectedMaxPrice + ") = FAIL; Actual maximal price: " + actualMaxPrice + ".");
        }
        System.out.println(" ");
    }
}
