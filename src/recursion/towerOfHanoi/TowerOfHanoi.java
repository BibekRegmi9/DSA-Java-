package recursion.towerOfHanoi;

public class TowerOfHanoi {

    // Recursive function to solve the Tower of Hanoi puzzle
    public static void solveHanoi(int n, char source, char auxiliary, char destination) {
        // Base case: If there is only one disk, move it directly
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Move top n-1 disks from source to auxiliary, using destination as temporary peg
        solveHanoi(n - 1, source, destination, auxiliary);

        // Move the nth (largest) disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Move the n-1 disks from auxiliary to destination, using source as temporary peg
        solveHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int n = 20; // Number of disks
        solveHanoi(n, 'A', 'B', 'C'); // A, B, C are names of the rods
    }
}
