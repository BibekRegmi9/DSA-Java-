package lld.designPattern.strategyPattern;

public class EsewaPayment implements PaymentStrategy{
    private String phoneNumber;


    public EsewaPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Google Pay: " + phoneNumber);
    }
}
