import java.util.*;
public class HashingQuestions {
    //QU1 : union of 2 arrays -->
    public static void  unionOfArrays(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        System.out.println(set);
    }
    //QU 2 : majority element in an array which comes n/3 times -->
    public static void majorityElement(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key) > n/3){
                System.out.println(key);
            }
        }
    }
    //QU 3 : Intersection of 2 arrays -->
    public static void Intersection(int[] arr1,int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n1;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<n2;i++){
            if(set.contains(arr2[i])){
                System.out.println(arr2[i]);
                set.remove(arr2[i]);
            }
        }
    } 
    //QU 4 : find Iternary from tickets -->find path from start to end
    public static String getStart(HashMap<String,String> tickets){
        //first find the start -->
        //create a reverse map-->
        HashMap<String ,String> revMap = new HashMap<>();
        for(String key:tickets.keySet()){
            revMap.put(tickets.get(key),key);
        }
        //find the start which occurs in tickets map key but does not occurs in reverse map key-->
        for(String key : tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        } 
        return null;
    } 
    public static void Itinerary(HashMap<String,String> tickets){
        String start= getStart(tickets);
        while(tickets.containsKey(start)){
            System.out.print(start+"-->");
            start = tickets.get(start);
        }
        System.out.print(start);
    }
    //QU 5 :find SubArray sum equals k  
    public static void FindSubArray(int[] arr,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);//for empty subarray
        int ans = 0;
        int sum = 0;
        for(int j=0;j<arr.length;j++){
            sum += arr[j];
            if(map.containsKey(sum-k)){
                ans += map.get(sum-k);
            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }else{
                map.put(sum,1);
            }
        }
        System.out.println(ans);
    }
    public static void main(String args[]){
        // int[] arr1 = {7,3,9};
        // int[] arr2 = {6,3,9,2,9,4};
        // unionOfArrays(arr1,arr2);
        // int[] arr = {1,3,2,5,1,3,1,5,1};
        // majorityElement(arr);
        // Intersection(arr1, arr2);
        // HashMap<String, String> tickets = new HashMap<>();
        // tickets.put("Chennai","Bengluru");
        // tickets.put("Mumbai","Delhi");
        // tickets.put("Goa","Chennai");
        // tickets.put("Delhi","Goa");
        // Itinerary(tickets);
        int[] arr = {1,2,3};
        FindSubArray(arr, 3);
    }
}
