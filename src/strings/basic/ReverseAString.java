package strings.basic;

public class ReverseAString {
    public static void main(String[] args) {
        String name = "john";
        String ans = reverse(name);
        System.out.println(ans);
    }

    public static String reverse(String name){
        char[] chars = name.toCharArray();
        int start = 0;
        int end = chars.length-1;

        while(start < end){
            swap(start, end , chars);
            start++;
            end--;
        }
        return  new String(chars);

    }

    public static void swap(int start, int end, char[] name){
        char temp = name[start];
        name[start] = name[end];
        name[end] = temp;
    }
}
