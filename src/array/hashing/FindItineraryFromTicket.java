package array.hashing;

import java.util.HashMap;

//"chennai" --->  "bangalore"
//"mumbai"  --->  "delhi"
//"goa"     --->  "chennai"
//"delhi"   --->  "goa"
public class FindItineraryFromTicket {
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();

        tickets.put("chennai", "bangalore");
        tickets.put("mumbai", "delhi");
        tickets.put("goa", "chennai");
        tickets.put("delhi", "goa");

        String start = getStart(tickets);

        System.out.println(start);

        for(String key: tickets.keySet()){
            System.out.println("---> " + tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();
    }

    public static String getStart(HashMap<String, String> tickets){
        HashMap<String, String> revMap = new HashMap<>();

        for(String key: tickets.keySet()){
            revMap.put(tickets.get(key), key);
        }

        for(String key: tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
}
