package recursion.permutation;

public class KeyPad {

    public static void main(String[] args) {
        keyPad("", "12");

    }
    public static void keyPad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0'; //to convert 0 to '0'
        for(int i = (digit-1) * 3; i < digit * 3; i++){
            char ch = (char) ('a' + i);
            keyPad(p + ch, up.substring(1));
        }
    }
}