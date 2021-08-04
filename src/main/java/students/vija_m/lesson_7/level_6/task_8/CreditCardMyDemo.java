package students.vija_m.lesson_7.level_6.task_8;

class CreditCardMyDemo {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(123456789, 5678);
        creditCard.setCreditLimit(1000.00);
        creditCard.deposit(5678, 150.59);
        System.out.println("creditCard balance = " + creditCard.getBalance());
        System.out.println("creditCard debt= " + creditCard.getCardDebt());
        creditCard.withdraw(5678,801.02);
        System.out.println("creditCard balance = " + creditCard.getBalance());
        System.out.println("creditCard debt= " + creditCard.getCardDebt());
    }
}

