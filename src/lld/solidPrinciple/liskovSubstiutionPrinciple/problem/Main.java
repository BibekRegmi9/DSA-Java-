package lld.solidPrinciple.liskovSubstiutionPrinciple.problem;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Square();
        rect.setWidth(10);
        rect.setHeight(5);

        System.out.println("Expected area: 10 * 5 = 50");
        System.out.println("Actual area: " + rect.getArea()); // Output: 25, but expected 50!
    }
}
