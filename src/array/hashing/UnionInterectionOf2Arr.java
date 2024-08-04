package array.hashing;

import java.util.HashSet;

public class UnionInterectionOf2Arr {
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        HashSet<Integer> set = new HashSet<>();

        //union
        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i = 0; i < arr2.length; i++){
            set.add(arr2[i]);
        }

        System.out.println("union = " + set.size());

        //Interection
        HashSet<Integer> newSet = new HashSet<>();

        for(int i = 0; i < arr1.length; i++){
            newSet.add(arr1[i]);
        }

        int count = 0;
        for(int i = 0; i < arr2.length; i++){
            if(newSet.contains(arr2[i])){
                count ++;
                newSet.remove(arr2[i]);
            }
        }
        System.out.println("Intersection = " + count);
    }
}
