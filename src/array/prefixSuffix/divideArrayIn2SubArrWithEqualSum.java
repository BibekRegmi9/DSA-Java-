package array.prefixSuffix;

public class divideArrayIn2SubArrWithEqualSum {


    public int prefix(int[] arr){
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
