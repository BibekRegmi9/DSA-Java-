package recursion;

public class SumOfSquareOfNNum {
    public static void main(String[] args) {
        System.out.println(sum(3));
    }

    static int sum(int n){
        if(n == 1){
            return 1;
        }

        return n*n + sum(n-1);
    }
}
