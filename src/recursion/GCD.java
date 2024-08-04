package recursion;

public class GCD {
    public static void main(String[] args) {
        System.out.println(GCD(18, 48));
    }

    public static int GCD(int a, int b){
        if(b == 0){
            return a;
        }
        return GCD(b, a % b);
    }
}
