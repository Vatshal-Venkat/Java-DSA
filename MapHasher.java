import java.util.HashMap;
import java.util.Map;

public class MapHasher {
    public static void main(String[] args) {
        HashMap<String, Integer> mp = new HashMap<>();

        mp.put("India", 9);
        mp.put("Australia",13);
        mp.put("West Indies", 4);
        mp.put("England", 3);

        if (mp.containsKey("Australia")){
            System.out.println("Key is present");
        }else{
            System.out.println("key is not present");
        }

        //get()

        System.out.println(mp.get("India"));

        for (Map.Entry<String,Integer> e : mp.entrySet()){
            System.out.print(e.getKey()+ ": ");
            System.out.println(e.getValue());
        }

    }
}
