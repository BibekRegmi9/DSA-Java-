package recursion.string;

public class LowerCaseToUpperCase {
    public static void main(String[] args) {
        String str = "bibek";
        char[] string = str.toCharArray();
        System.out.println(fn(string, 4));
    }

    public static char[] fn(char[] string, int index){
        if(index < 0){
            return string;
        }

        string[index] = (char) ('A' + string[index] - 'a');
        return fn(string, index - 1);
    }
}
