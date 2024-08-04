package recursion;

public class NthStair {
    public static void main(String[] args) {
        System.out.println(NthStairs(3));
    }

    static int NthStairs(int n){
        if(n < 2){
            return 1;
        }

        return NthStairs(n-1) + NthStairs(n-2);
    }
}
