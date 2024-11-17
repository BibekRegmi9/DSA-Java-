package array.binarysearch;

public class FindSquareRoot {
    public static void main(String[] args) {
        int ans = mySqrt(2147395599);
        System.out.println(ans);
    }

    public static int mySqrt(int x) {
        if(x < 2){
            return x;
        }

        int start = 0;
        int end = x;

        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

//            if(mid * mid == x){
            if(mid == x/mid){
                return mid;
//            } else if(mid * mid < x){
            } else if(mid < x/mid){
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }
}
