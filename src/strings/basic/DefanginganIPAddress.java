package strings.basic;

public class DefanginganIPAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }

    public static String defangIPaddr(String address) {
        char[] addr = address.toCharArray();
        String ans = "";
        for(int i = 0; i < addr.length; i++){
            if(addr[i] == '.'){
                ans += "[.]";
            } else {
                ans += addr[i];
            }
        }
        return ans;
    }

    public static String test(String address){
        char[] chars = address.toCharArray();
        String ans = "";
        for(char ch : chars){
            if(ch == '.'){
                ans += "[.]";
            } else {
                ans += ch;
            }
        }

        return ans;
    }
}
