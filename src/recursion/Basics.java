package recursion;

public class Basics {
    public static void main(String[] args) {
//        printNto1(10);
        print1ToN(10);
    }

    public static void printNto1(int no){
        if(no == 0){
            return;
        }
        System.out.println(no);
        printNto1(no - 1);
    }

    public static void print1ToN(int no){
        if(no < 1){
            return;
        }

        print1ToN(no -  1);
        System.out.println(no);
    }


}
