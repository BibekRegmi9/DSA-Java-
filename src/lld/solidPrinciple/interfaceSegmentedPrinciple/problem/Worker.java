package lld.solidPrinciple.interfaceSegmentedPrinciple.problem;

public interface Worker {
    void work();
    void eat();
}

class HumanWorker implements Worker {
    public void work() {
        System.out.println("Human is working...");
    }

    public void eat() {
        System.out.println("Human is eating...");
    }
}

class RobotWorker implements Worker {
    public void work() {
        System.out.println("Robot is working...");
    }

    public void eat() {
        // ❌ Robots don’t eat, but we are forced to implement this method
        throw new UnsupportedOperationException("Robots don't eat!");
    }
}

