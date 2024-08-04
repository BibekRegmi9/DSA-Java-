package recursion;

public class PowOf2 {
    public static void main(String[] args) {
        System.out.println(powerOf2(2, 4));
    }

    static int powerOf2(int N, int n){
        if(n < 2){
            return 2;
        }

        return N * powerOf2(N, n-1);
    }
}
