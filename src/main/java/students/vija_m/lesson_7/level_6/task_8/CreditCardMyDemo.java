package students.vija_m.lesson_7.level_6.task_8;

class CreditCardMyDemo {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(123456789, 5678);
        creditCard.deposit(5678, 150.00);
        System.out.println("creditCard = " + creditCard.getBalance());
        System.out.println("creditCard debt= " + creditCard.getCardDebt());
    }
}

