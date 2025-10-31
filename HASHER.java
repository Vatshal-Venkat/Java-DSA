
import java.util.LinkedList;

public class HASHER {
    static class HashMap<K,V> {
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int N;
        private int n;
        private LinkedList<Node> buckets[];



        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i=0;i<4;i++){
                this.buckets[i] = new LinkedList<>();
            }
        }


        private int hashfunction(K key){
            int bi = key.hashCode();
            return Math.abs(bi) % N;

        }


        private int searchinLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            
            for(int i=0; i<ll.size();i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }

        private void rehash(){
            LinkedList<Node> oldBuckets[] = buckets;
            buckets = new LinkedList[2*N];

            for(int i=0; i<2*N; i++){
                buckets[i] = new LinkedList<>();
            }

            for(int i = 0; i<oldBuckets.length; i++){
                LinkedList<Node> ll = oldBuckets[i];
                for (int j=0; j<ll.size();j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value){
            int bi = hashfunction(key);
            int di = searchinLL(key, bi);

            if (di == -1){
                buckets[bi].add(new Node(key, value));
                n++;
            }else{
                Node data = buckets[bi].get(di);
                data.value = value;
            }

            double lamda = (double) n/N;
            if (lamda>2.0){
                rehash();
            }
        }

        public V get(K key){
            int bi = hashfunction(key);
            int di = searchinLL(key, bi);

            if (di == -1){
                return null;
            }else{
                Node data = buckets[bi].get(di);
                return data.value;
            }

        }


        public boolean containskey(K key){
            int bi = hashfunction(key);
            int di = searchinLL(key, bi);

            if (di == -1){
                return false;
            }else{
                Node data = buckets[bi].get(di);
                return true;
            }
        }
    }



    public static void main(String args[]){
        HashMap<String, Integer> map= new HashMap<>();
        map.put("India",5);
        map.put("Australia",8);
        map.put("West Indies", 4);
        map.put("New Zealand", 4);
        map.put("England",3);
    }
}
