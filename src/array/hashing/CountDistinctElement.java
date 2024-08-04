package array.hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class CountDistinctElement {
    public static void main(String[] args) {
        int num[] = {4, 3, 2 ,5, 6 ,7, 3, 4, 2, 1};
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < num.length; i++){
            set.add(num[i]);
        }

        System.out.println("ans = " + set.size());


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> newNumber = numbers.stream().filter(x -> x != 3).map(x -> x * 0).collect(Collectors.toList());
        System.out.println(newNumber);
    }
}
