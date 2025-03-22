package lld.designPattern.strategyPattern;

public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // pay using credit card
        paymentContext.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432", "John Doe"));
        paymentContext.pay(250.00);

        // pay using paypal
        paymentContext.setPaymentStrategy(new PayPalPayment("john@example.com"));
        paymentContext.pay(500.00);

        // pay using esewa
        paymentContext.setPaymentStrategy(new EsewaPayment("+977 9777586880"));
        paymentContext.pay(10000.00);
    }
}
