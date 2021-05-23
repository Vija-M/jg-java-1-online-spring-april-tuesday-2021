package students.ernests_subhankulovs.lesson_4.level_6.task_16;

class Stock {
    String companyName;
    int currentPrice;
    int minimalPrice;
    int maximalPrice;

    Stock(String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minimalPrice = currentPrice;
        this.maximalPrice = currentPrice;
    }

    void updatePrice(int newPrice) {
        if (newPrice > this.currentPrice && newPrice > this.maximalPrice) {
            this.maximalPrice = newPrice;
        }
        else if (newPrice < this.currentPrice && newPrice < this.minimalPrice) {
            this.minimalPrice = newPrice;
        }
        this.currentPrice = newPrice;
    }

    String getPriceInformation() {
        return "Company = " + this.companyName + ", Current Price = " + this.currentPrice + ", Min Price = " + this.minimalPrice + ", Max Price = " + this.maximalPrice;
    }
}
