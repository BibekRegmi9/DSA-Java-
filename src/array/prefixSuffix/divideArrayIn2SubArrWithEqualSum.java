package array.prefixSuffix;

public class divideArrayIn2SubArrWithEqualSum {

    public static void main(String[] args) {
        int[] arr = {2,4,6,2,1,5,8,2};
        int ans = prefixBruteforce(arr);
        System.out.println(ans);
    }

    //bruteforce
    public static int prefixBruteforce(int[] arr){

        for(int i = 0; i < arr.length-1; i++){
            int sum1 = 0;
            int sum2 = 0;

            for(int j = 0; j <= i; j++){
                sum1 += arr[j];
            }
            for(int j = i + 1; j < arr.length; j++){
                sum2 += arr[j];
            }

            return sum1==sum2 ? 1 : 0;
        }
        return 0;
    }


    public static int prefix(int[] arr){
        int totalSum =  0;
        for(int i = 0; i < arr.length-1; i++){
            totalSum += arr[i];
        }
        int prefix = 0;
        for(int i = 0; i < arr.length-1; i++){
            prefix += arr[i];
            int ans = totalSum - prefix;

            if(ans == prefix){
                return 1;
            }
        }
        return 0;
    }
}
