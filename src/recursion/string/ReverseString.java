package recursion.string;

public class ReverseString {
    public static void main(String[] args) {
        String str = "bibek";
        char[] string = str.toCharArray();
        char[] m = reverse(string, 0, 4);
        System.out.println(m);
    }

    public static char[] reverse(char[] str, int start, int end){
        if(start >= end){
            return str;
        }
//        System.out.println(str.charAt(index));
//        reverse(str, index - 1);

        char temp = str[start];
        str[start] = str[end];
        str[end] = temp;

        return reverse(str, start+1, end-1);
    }
}
