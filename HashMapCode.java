import java.util.*;
public class HashMapCode {
    static class HashMap<K,V>{//Generics
        private class Node{
            K key;
            V value;
            Node(K key,V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n;//No. of nodes
        private int N;//No. of buckets
        private LinkedList<Node> buckets[];
        @SuppressWarnings("Unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[N];
            for(int i=0;i<N;i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
        //hash function -->
        private int hashFunction(K key){
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }
        private int searchInLL(K key,int bi){
            LinkedList<Node> ll = buckets[bi];
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key == key){
                    return i;//Di
                }
            }
            return -1;
        }
        private void rehash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];
            for(int i=0;i<N*2;i++){
                buckets[i] = new LinkedList<>();
            }
            for(int i=0;i<oldBucket.length;i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j=0;j<ll.size();j++){
                    Node node = ll.get(j);
                    put(node.key,node.value);
                }
            }
        }
        public void put(K key,V value){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di == -1){
                //key does not exist 
                buckets[bi].add(new Node(key,value));
                n++;
            }
            else{
                //key exist
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            double lambda = (double)n/N;
            if(lambda < 2.0){
                rehash();
            }
        }
        public V get(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di == -1){
                return null;
            }
            else{
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }
        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            return di == -1;
        }
        public V remove(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di == -1){
                return null;
            }else{
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }
        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll = buckets[i];
                for(int j = 0;j<ll.size();j++){
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return n == 0;
        }
    }
    public static void main(String args[]){
        HashMap<String , Integer> map = new HashMap<>();
        map.put("India" , 190);
        map.put("China" , 200);
        map.put("USA" , 50);
        ArrayList<String> keys = map.keySet();
        for(int i=0;i<keys.size();i++){
            System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
        }
        map.remove("China");
        System.out.println(map.get("China"));
    }
}

//hashMap implementation -->
// public class HashMapCode {
//     static class HashMap<K,V>{//generics
//         public class Node{
//             K key;
//             V value;
//             public Node(K key,V value){
//                 this.key = key;
//                 this.value = value;
//             }
//         }
//         private int n;//No. of nodes
//         private int N;//No. of Buckets or size of array
//         private LinkedList<Node> buckets[];//creating a array which stores linked list->
//         @SuppressWarnings("Unchecked")
//         public HashMap(){
//             this.N = 4;
//             this.buckets = new LinkedList[N];
//             for(int i=0;i<N;i++){
//                 this.buckets[i] = new LinkedList<>();
//             }
//         }

//         //Hashing function -->to get bi(bucket index)
//         private int hashFunction(K key){
//             int bi = key.hashCode();
//             return Math.abs(bi) % N;
//         }
//         //searchInLL function --> to get di(data index)
//         private int searchInLL(int bi,K key){
//             LinkedList<Node> ll = buckets[bi];
//             for(int i=0;i<ll.size();i++){
//                 if(ll.get(i).key == key){
//                     return i;//di
//                 }
//             }
//             return -1;//di
//         }
//         public void put(K key,V value){
//             int bi = hashFunction(key);
//             int di = searchInLL(bi, key);
//             if(di == -1){
//                 buckets[bi].add(new Node(key,value));
//                 n++;
//             }else{
//                 Node node = buckets[bi].get(di);
//                 node.value = value;
//             }
//             //For rehashing -->
//             double lambda = (double)n/N;
//             if(lambda > 2.0){
//                 rehash();
//             }
//         }
//         //Rehash function -->
//         @SuppressWarnings("Unchecked")
//         private void rehash(){
//             LinkedList<Node> oldBuckets[] = buckets;
//             buckets = new LinkedList[N*2];
//             for(int i=0;i<N*2;i++){
//                 buckets[i] = new LinkedList<>();
//             }
//             for(int i=0;i<oldBuckets.length;i++){
//                 LinkedList<Node> ll = oldBuckets[i];
//                 for(int j=0;j<ll.size();j++){
//                     Node node = ll.get(j);
//                     put(node.key, node.value);
//                 }
//             }
//         }
//         //get Function -->
//         public V get(K key){
//             int bi = hashFunction(key);
//             int di = searchInLL(bi, key);
//             if(di == -1){
//                 return null;
//             }else{
//                 Node node =  buckets[bi].get(di);
//                 return node.value;
//             }
//         }
//         //remove function -->
//         public V remove(K key){
//             int bi = hashFunction(key);
//             int di = searchInLL(bi, key);
//             if(di == -1){
//                 return null;
//             }else{
//                 Node node = buckets[bi].remove(di);
//                 n--;
//                 return node.value;
//             }
//         }
//         //Contains key code -->
//         public boolean containsKey(K key){
//             int bi = hashFunction(key);
//             int di = searchInLL(bi, key);
//             return di == -1;
//         }
//         public boolean isEmpty(){
//             return n == 0;
//         }
//     }
//     public static void main(String args[]){
//         HashMap<String , Integer> map = new HashMap<>();
//         map.put("China" , 120);
//         map.put("India",100);
//         map.put("Nep",20);
//         System.out.println(map.get("India"));
//         map.remove("India");
//         System.out.println(map.get("India"));
//         System.out.println(map.containsKey("I"));
//     }
// }