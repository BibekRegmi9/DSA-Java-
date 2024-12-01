package array.twoPointer;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(3);
        a.add(3);

        int ans = removeDuplicates(a);
        System.out.println(ans);
    }
    public static int removeDuplicates(ArrayList<Integer> a) {
        return a.stream().distinct().toArray().length;

    }
}
