package lld.solidPrinciple.interfaceSegmentedPrinciple.solution;

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}


class HumanWorker implements Workable, Eatable {
    public void work() {
        System.out.println("Human is working...");
    }

    public void eat() {
        System.out.println("Human is eating...");
    }
}

class RobotWorker implements Workable {
    public void work() {
        System.out.println("Robot is working...");
    }
}
