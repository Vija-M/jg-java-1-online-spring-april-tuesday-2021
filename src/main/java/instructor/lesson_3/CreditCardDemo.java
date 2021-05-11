package instructor.lesson_3;

class CreditCardDemo {

    public static void main(String[] args) {

        CreditCard creditCardOne = new CreditCard();
        creditCardOne.bankName = "The Bank";
        creditCardOne.cardHolderName = "John Doe";
        creditCardOne.cardNumber = "1234 5678 8765 4321";
        creditCardOne.cardExpiration = "12/2022";
        creditCardOne.cardSecurityCode = 123;

        System.out.println("creditCardOne.bankName = " + creditCardOne.bankName);
        System.out.println("creditCardOne.cardHolderName = " + creditCardOne.cardHolderName);
        System.out.println("creditCardOne.cardNumber = " + creditCardOne.cardNumber);
        System.out.println("creditCardOne.cardExpiration = " + creditCardOne.cardExpiration);
        System.out.println("creditCardOne.cardSecurityCode = " + creditCardOne.cardSecurityCode);

        CreditCard creditCardTwo = new CreditCard();
        creditCardTwo.bankName = "The Bank 2";
        creditCardTwo.cardHolderName = "Johnny Donny";
        creditCardTwo.cardNumber = "2345 6789 9876 5432";
        creditCardTwo.cardExpiration = "06/2025";
        creditCardTwo.cardSecurityCode = 568;

        System.out.println();
        System.out.println("creditCardTwo.bankName = " + creditCardTwo.bankName);
        System.out.println("creditCardTwo.cardHolderName = " + creditCardTwo.cardHolderName);
        System.out.println("creditCardTwo.cardNumber = " + creditCardTwo.cardNumber);
        System.out.println("creditCardTwo.cardExpiration = " + creditCardTwo.cardExpiration);
        System.out.println("creditCardTwo.cardSecurityCode = " + creditCardTwo.cardSecurityCode);

    }
}
