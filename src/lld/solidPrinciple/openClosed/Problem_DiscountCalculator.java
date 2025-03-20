package lld.solidPrinciple.openClosed;

//Open-Closed Principle (OCP) states that a class should be open for extension but closed for modification.
public class Problem_DiscountCalculator {
    public double calculateDiscount(String customerType, double amount) {
        if (customerType.equals("Regular")) {
            return amount * 0.1;  // 10% discount for regular customers
        } else if (customerType.equals("VIP")) {
            return amount * 0.2;  // 20% discount for VIP customers
        }
        return 0;  // No discount for others
    }
}
