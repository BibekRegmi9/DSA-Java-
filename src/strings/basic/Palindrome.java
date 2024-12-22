package strings.basic;

public class Palindrome {
    public static void main(String[] args) {
        String s = "madam";
        Boolean ans = isPalindrome(s);
        System.out.println(ans);
    }

    public static Boolean isPalindrome(String word){
        char[] string = word.toCharArray();
        int start = 0;
        int end = string.length-1;

        while(start < end){
            swap(start, end, string);
            start++;
            end--;
        }

        String reversedString = new String(string);

        return word.equals(reversedString);
    }

    public static void swap(int start, int end, char[] chars){
        char temp = chars[start];
        chars[start] = chars[end];
        chars[end] = temp;
    }
}
