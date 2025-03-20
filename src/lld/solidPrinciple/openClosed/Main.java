package lld.solidPrinciple.openClosed;

public class Main {
    public static void main(String[] args) {
        Solution_DiscountCalculator calculator = new Solution_DiscountCalculator();

        double regularDiscount = calculator.calculateDiscount(1000, new RegularDiscount());
        System.out.println("Regular Customer Discount: " + regularDiscount);

        double vipDiscount = calculator.calculateDiscount(1000, new VIP_Discount());
        System.out.println("VIP Customer Discount: " + vipDiscount);
    }
}
