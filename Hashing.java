import java.util.*;
public class Hashing {
    public static void main(String args[]){
        //Define a hashSet -->
        // HashSet<Integer> set = new HashSet<>();
        // //Insertion -->set.add(el)
        // set.add(2);
        // set.add(3);
        // set.add(4);
        // set.add(2);
        // //Deletion -->
        // // set.remove(3);
        // //Get size -->
        // System.out.println(set.size());
        // //Contains -->
        // System.out.println(set.contains(2));
        // //Print the set -->
        // System.out.println(set);
        // //Iterator : Iterator has 2 functions next and hasNext -->
        // Iterator it = set.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        //HashMap -->
        //Defining a hashMap -->
        HashMap<String ,Integer> map = new HashMap<>();
        //Insertion-->
        map.put("India", 120);
        map.put("China" , 150);
        map.put("Us" , 50);
        //if we put an existing key with any value in map it will replace the value of that key 
        //get value of a key -->
        //if there is no such key it will return null 
        System.out.println(map.get("Us"));
        //search /Lookup -->
        System.out.println(map.containsKey("China"));
        //Deletion -->
        // map.remove("China");
        //print whole map-->
        System.out.println(map);
        //Iteration in map -->
        // for(Map.Entry<String,Integer> e : map.entrySet()){
        //     System.out.println(e.getKey());
        //     System.out.println(e.getValue());
        // }
        //2nd method of iteration using keys -->
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }
    }
}
