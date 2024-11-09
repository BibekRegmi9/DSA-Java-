package array.basics;

public class FibonnaciNo {
    public static void main(String[] args) {
        // Given Number N
        int N = 10;

        // Function Call
        Fibonacci(N);
    }
    static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;

        for (int i = 0; i < N; i++) {
            // Print the number
            System.out.println(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }
}
