package HomeworkW8.java;

public class PaymentSystemDemo {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment(100.0, "1234-5678-9012-3456");
        creditCard.processPayment();

        System.out.println();

        PayPalPayment paypal = new PayPalPayment(75.0, "customer@example.com");
        paypal.processPayment();
        paypal.refund(20.0);
    }
}