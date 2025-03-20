package lld.solidPrinciple.openClosed;

// Step 1: Create an interface for discount strategy
interface DiscountStrategy {
    double applyDiscount(double amount);
}

// Step 2: Implement different discount strategies
class RegularDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.1; // 10%
    }
}

class VIP_Discount implements DiscountStrategy{

    @Override
    public double applyDiscount(double amount) {
        return amount*0.2; //20%
    }
}

// Step 3: Use the strategy pattern in the calculator
public class Solution_DiscountCalculator {
    public double calculateDiscount(double amount, DiscountStrategy strategy) {
        return strategy.applyDiscount(amount);
    }
}

//public class Solution_DiscountCalculator {
//}
