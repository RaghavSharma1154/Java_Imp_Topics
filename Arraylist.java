import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        //Declaration of Array List -->
        ArrayList<Integer> arr = new ArrayList<>();

        //Operations of ArrayList -->
        //1. Add operation
        arr.add(4);
        arr.add(7);
        arr.add(2);
        arr.add(6);

        System.out.println(arr);
        //2. Get operation
        System.out.println(arr.get(2));
        //3. Add Element in between 
        arr.add(2,9);
        System.out.println(arr);
        //4. Set ELement / Update element
        arr.set(0,11);
        System.out.println(arr);
        //Delete Operation -->
        arr.remove(3);
        System.out.println(arr);
        //Sorting -->
        Collections.sort(arr);
        System.out.println(arr);
    }
}
