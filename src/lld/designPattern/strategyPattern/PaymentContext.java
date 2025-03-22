package lld.designPattern.strategyPattern;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    //set payment method dynamically
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(double amount){
        if(paymentStrategy == null){
            throw new IllegalStateException("Payment method/strategy not set");
        }
        paymentStrategy.pay(amount);
    }
}
