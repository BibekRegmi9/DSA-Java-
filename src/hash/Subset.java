package hash;

import java.util.HashSet;
import java.util.Set;

public class Subset {
    public static void main(String[] args) {

    }

    public static boolean isSubset(int[] arr1, int[] arr2){
        Set<Integer> hashSet = new HashSet<>();

        // add first array elements into hashset
        for(int no: arr1){
            hashSet.add(no);
        }

        // check if second array contains subset of first array
        for(int no: arr2){
            if(!hashSet.contains(no)){
                return false;
            }
        }

        return true;
    }
}
