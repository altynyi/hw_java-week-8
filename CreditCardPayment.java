package HomeworkW8.java;

class CreditCardPayment extends Payment {

    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment...");
        System.out.println("Verifying card number: " + cardNumber);
        System.out.println("Charging amount: $" + amount);
        System.out.println("Credit card payment successful!");
    }
}
