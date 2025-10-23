package HomeworkW8.java;

abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    // Abstract method to process payment
    public abstract void processPayment();
}
