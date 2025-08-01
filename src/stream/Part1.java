package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Part1 {

    // Find the longest string in a list of strings
    public void longestString() {
        List<String> stringsList = Arrays.asList("apple", "orange", "papaya", "banana");
        Optional<String> longestString = stringsList.stream().max(Comparator.comparingInt(String::length));
        System.out.println(longestString.get());
    }

    // Filter Even Numbers from a List
    public static void filterEven() {
        List<Integer> evenNumber = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(evenNumber.stream().filter(x -> x % 2 == 0).collect(Collectors.toList()));
    }


    // Find Maximum in a List
    public static void findMax() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println(numbers.stream().max(Integer::max));
    }


    // Sort a List in asc and desc order
    public static void sort() {
        List<Integer> numbers = Arrays.asList(3, 5, 1, 4, 2);
        System.out.println(numbers.stream().sorted().collect(Collectors.toList())); // asc
        System.out.println(numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
    }


    // Count strings starting with a specific prefix, e.g., “A”.
    public static void countPrefix() {
        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie");
        System.out.println(names.stream().filter(s -> s.startsWith("A")).count());
    }

    // Find First Non-Repeated Character in a String
    public void findFirstNonRepeatedCharacter() {
        String input = "swiss";
        System.out.println(input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> input.indexOf(c) == input.indexOf(c))
                .findFirst()
        );
    }


    // Convert List of Strings to Uppercase
    public static void convertToUppercase(){
        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie");
        System.out.println(names.stream().map(x -> x.toUpperCase()).collect(Collectors.toList()));
    }

    // Sum of Numbers in a List
    public static void sumOfNumbers(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());
    }

    //Check if Any String Matches a Condition
    public static void checkIfAnyStringMatchesCondition(){
        List<String> strings = Arrays.asList("Java", "Stream API", "Lambda");
        System.out.println(strings.stream().anyMatch(s -> s.contains("API")));
    }

    //Find Duplicate Elements in a List
    public static List<String> findDuplicateElements(List<String> strings) {
        HashMap<String, Integer> hashMap = new HashMap<>();
//        String[] arr = strings.toArray(new String[0]);
        for(String s : strings){
            hashMap.put(s, hashMap.getOrDefault(s, 0) + 1);
        }

        List<String> ans = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : hashMap.entrySet()){
            if(entry.getValue() > 1){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        filterEven();
//        findMax();
//        sort();
//        countPrefix();
//        convertToUppercase();
//        sumOfNumbers();
//        checkIfAnyStringMatchesCondition();

//        List<String> names = Arrays.asList("Alex", "Bob", "Annie", "Alex", "Charlie");
//        System.out.println(findDuplicateElements(names));



    }
}
