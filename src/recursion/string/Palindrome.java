package recursion.string;

public class Palindrome {
    public static void main(String[] args) {
        String str = "bad";
        System.out.println(isPalindrome(str, 0, str.length() - 1));
    }

    public static Boolean isPalindrome(String str, int start, int end){
        if(start >= end){
            return true;
        }
        if(str.charAt(start) != str.charAt(end)){
            return false;
        }

        return isPalindrome(str, start + 1, end - 1);

    }
}
