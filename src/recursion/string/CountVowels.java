package recursion.string;

public class CountVowels {
    public static void main(String[] args) {
        String str = "bibek";
        System.out.println(count(str, str.length()-1));
    }

    public static int count(String str, int index){
        if(index < 0){
            return 0;
        }

        if(str.charAt(index) == 'a' ||
                str.charAt(index) == 'e' ||
                str.charAt(index) == 'i' ||
                str.charAt(index) == 'o' ||
                str.charAt(index) == 'u'
        ) {
            return 1 + count(str, index - 1);
        } else {
            return count(str, index - 1);
        }
    }
}
