
import java.util.*;

public class Linkimp {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("Venkat Vatshal");
        list.addLast("is SpiderMan!");
        list.addFirst("SUPERHERO!");
        System.out.println(list.size());
        list.remove(0);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
    }
}
