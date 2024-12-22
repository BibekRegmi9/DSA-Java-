package strings.basic;

public class StringRotatedby2Places {
    public static void main(String[] args) {
        System.out.println(rotateBy1ClockWise("amazon"));
        System.out.println(rotateBy1AntiClockWise("amazon"));
    }

    public static String rotateBy1ClockWise(String str1){
        char[] string1 = str1.toCharArray();
        char lastChar = string1[string1.length-1];

        for(int i = string1.length-1; i > 0; i--) {
            string1[i] = string1[i-1];
        }
        string1[0] = lastChar;
        return new String(string1);
    }

    public static String rotateBy1AntiClockWise(String str1){
        char[] string1 = str1.toCharArray();
        char firstChar = string1[0];

        for(int i = 0; i < string1.length-1; i++){
            string1[i] = string1[i+1];
        }
        string1[string1.length-1] = firstChar;
        return new String(string1);
    }
}
