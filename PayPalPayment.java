package HomeworkW8.java;

class PayPalPayment extends Payment implements Refundable {

    private String email;

    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment...");
        System.out.println("Verifying PayPal account: " + email);
        System.out.println("Transferring amount: $" + amount);
        System.out.println("PayPal payment successful!");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Initiating refund to PayPal account: " + email);
        System.out.println("Refund amount: $" + amount);
        System.out.println("Refund completed successfully!");
    }
}
