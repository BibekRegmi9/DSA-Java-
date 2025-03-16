package strings.basic;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        //Reverse a string
//        String str = "Bibek";
//        String ans = reverse(str);
//        System.out.println(ans);


        // swap two numbers without using 3rd variable
//        swapNumber(5, 9);

        // count the number of words in a string
//        Map<String, Integer> ans = countWords("My name is Bibek Regmi is");
//        System.out.println(ans);


        //check prime number
//        System.out.println(isPrimeNumber(5));

        //check string if palindrome or not
//        System.out.println(isPalindrome("madam"));

        // find fibonacci number
        System.out.println(fibonacci(7));
    }

    //Reverse a string
    public static String reverse(String string){
        char[] chars = string.toCharArray();
        int start = 0;
        int end = chars.length-1;

        while(start < end){
            swap(chars, start, end);
            start++;
            end--;
        }
        return new String(chars);
    }

    //Reverse a string
    private static void swap(char[] chars, int start, int end) {
        char temp = chars[start];
        chars[start] = chars[end];
        chars[end] = temp;
    }


    // swap two numbers without using 3rd variable
    public static void swapNumber(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
    }


    // count the number of words in a string
    public static Map<String, Integer> countWords(String input){
        Map<String, Integer> wordCount = new HashMap<>();
            String[] words = input.split("\\s+");

            for(String word: words){
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }

            return wordCount;


    }

    //check prime number
    public static boolean isPrimeNumber(int num){
        if(num < 2){
            return false;
        }

        for(int i = 2; i < num; i++){
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    //check string if palindrome or not
    public static boolean isPalindrome(String input){
        char[] string = input.toCharArray();
        int start = 0;
        int end = string.length-1;

        while(start < end){
            if(input.charAt(start) != input.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // find fibonacci number
    public static int fibonacci(int n){
        if(n < 2){
            return n;
        }

        return fibonacci(n-2) + fibonacci(n-1);
    }


    //find the duplicate characters in a string
    public static void findDuplicateInString(String input){
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char c: input.toCharArray()){
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry: hashMap.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + " appears" + entry.getValue() + " times");
            }
        }

    }
}
