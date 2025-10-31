//Create and apply HashSet
import java.util.HashSet;
import java.util.Iterator;
//Iterator for HashSet

public class Hashed {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(1);
        set1.add(2);
        set1.add(3);

        if (set1.contains(1)){
            System.out.println("Yes, the set contains 1");
        }
 
        set1.remove(1);
        set1.size();

        Iterator it = set1.iterator();
        System.out.println(set1);


        //printing elements trhough iterator
        //.next, .hasNext

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
