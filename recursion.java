import java.util.*;
public class recursion {
    // Fibonacci series -->
    // public static void fib(int a, int b , int n){
    //     if(n == 0){
    //         return;
    //     }
    //     int c = a + b;
    //     System.out.print(c + " ");
    //     fib(b,c,n-1);
    // }  
//    public static void main(String args[]){
//         int a = 0, b = 1;
//         int n = 8;
//         System.out.print(a+" "+b+" ");
//         fib(a,b,n);
//    }

    //print x^n (Stack height = n)
    // static int calc(int x,int n){
    //     if(n == 0){
    //         return 1;
    //     }
    //     if(x == 0){
    //         return 0;
    //     }
    //     if(n % 2 == 0){
    //         return calc(x,n/2) * calc(x,n/2);
    //     }else{
    //         return calc(x,n/2) * calc(x,n/2) *x;
    //     }
    // }
    // public static void  main(String args[]){
    //     int x = 2 , n=5;
    //     int res = calc(x,n);
    //     System.out.println(res);
    // }
    
    //Recursion best problems -->

    // Qu : FInd 1st and last occurance of an element in a string -->
    // public static int first = -1;
    // public static int last = -1;
    // public static void fo(String str , int idx, char element){
    //     if(idx == str.length()){
    //         System.out.println("first occurance at " + first +" and last occurance at " + last);
    //         return;
    //     }
    //     char curr = str.charAt(idx);
    //     if(curr == element){
    //         if(first == -1){
    //             first = idx;
    //         }else{
    //             last = idx;
    //         }
    //     } 
    //     fo(str,idx+1,element);
    // }
    // public static void main(String args[]){
    //     String str = "aabcdag";
    //     fo(str,0,'a');
    // }

    //Qu : check if a array is sorted or not -->(Strictly increasing)
    // public static boolean sorted(int[] arr,int idx){
    //     if(idx == arr.length-1){
    //         return true;
    //     }
    //     if(arr[idx] < arr[idx+1]){
    //         return sorted(arr,idx+1);
    //     }else 
    //         return false;
    // }
    // public static void main(String args[]){
    //     int[] arr = {1,2,3,6,7};
    //     System.out.println(sorted(arr, 0));
    // }

    //qu:Move all x to the end of string -->
    // public static void moveAllx(String str,int idx,int count,String newStr){
    //     if(idx == str.length()){
    //         for(int i=0;i<count;i++){
    //             newStr+='x';
    //         }
    //         System.err.println(newStr);
    //         return;
    //     }
    //     char curr = str.charAt(idx);
    //     if(curr == 'x'){
    //         count++;
    //         moveAllx(str, idx+1, count, newStr);
    //     }else{
    //         newStr += curr;
    //         moveAllx(str, idx+1, count, newStr);
    //     }
    // }
    // public static void main(String args[]){
    //     String str = "abxcdxxfvd";
    //     moveAllx(str, 0, 0, "");
    // }

    //QU: Remove duplicates from a string -->
    // public static boolean[] map = new boolean[26];
    // public static void rd(String str,int idx,String newStr){
    //     if(idx == str.length()){
    //         System.out.println(newStr);
    //         return;
    //     }
    //     char curr = str.charAt(idx);
    //     if(map[curr-'a'] == true){
    //         rd(str,idx+1,newStr);
    //     }else{
    //         newStr += curr;
    //         map[curr - 'a']= true;
    //         rd(str, idx+1, newStr);
    //     }
    // }
    // public static void main(String args[]){
    //     String str = "abcdfgac";
    //     rd(str, 0, "");
    // }

    //Qu: Print all subsequence of a string -->
    // public static void subsequences(String str ,int idx , String newStr){
    //     if(idx == str.length() ){
    //         System.out.println(newStr);
    //         return;
    //     }
    //     char curr = str.charAt(idx);
    //     //to be -->
    //     subsequences(str, idx+1, newStr+curr);
    //     //not to be -->
    //     subsequences(str, idx+1, newStr);
    // }
    // public static void main(String args[]){
    //     String str = "abc";
    //     subsequences(str, 0, "");
    // }

    //qu:print all the unique substrings in a string -->
    // public static void subsequences(String str,int idx,String newStr,HashSet<String> set){
    //     if(idx == str.length()){
    //         if(set.contains(newStr)){
    //             return;
    //         }else{
    //             System.out.println(newStr);
    //             set.add(newStr);
    //             return;
    //         }
    //     }
    //     char curr = str.charAt(idx);
    //     //to be -->
    //     subsequences(str, idx+1, newStr+curr, set);
    //     //not to be -->
    //     subsequences(str, idx+1, newStr, set);
    // }
    // public static void main(String args[]){
    //     HashSet<String> set = new HashSet<>();
    //     String str = "aaa";
    //     subsequences(str, 0, "", set);
    // }

    //QU : Print Combination -->
    // public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
    // public static void comb(String str, int idx,String combination){
    //     if(idx == str.length()){
    //         System.out.println(combination);
    //         return;
    //     }
    //     char curr = str.charAt(idx);
    //     String mapping = keypad[curr-'0'];
    //     for(int i=0;i<mapping.length();i++){
    //         comb(str, idx+1, combination+mapping.charAt(i));
    //     }
    //  }
    //  public static void main(String args[]){
    //     String str = "23";
    //     comb(str, 0, "");
    //  }

    //Advanced Recursion Questions -->

    //Qu : Print all permutations of a string -->
    // public static void permutations(String str,String perm){
    //     if(str.length() == 0){
    //         System.out.println(perm);
    //         return;
    //     }
    //     for(int i=0;i<str.length();i++){
    //         char curr = str.charAt(i);
    //         String newStr = str.substring(0,i) + str.substring(i+1);
    //         permutations(newStr, perm+curr);
    //     }
    // }
    // public static void main(String args[]){
    //     String str =  "abc";
    //     permutations(str, "");
    // }

    //QU : Count total paths in a maze to move from (0,0) to (n,m) -->
    //condition : can only move to right or downwards
    // public static int countPaths(int i,int j,int n,int m){
    //     if(i == n-1 && j == m-1){
    //         return 1;
    //     }
    //     if(i == n || j == m){
    //         return 0;
    //     }

    //     //Move Right -->
    //     int right = countPaths(i, j+1, n, m);
    //     //Move Downwards -->
    //     int left = countPaths(i+1, j, n, m);
    //     return right + left;
    // } 
    // public static void main(String args[]){
    //     int res = countPaths(0, 0, 3, 3);
    //     System.out.println(res);
    // }

    //Qu : place tiles of size 1 * m in a floor size n * m
    // public static int placeTiles(int n,int m){
    //     //base case -->
    //     if(n == m) return 2;
    //     if(n < m) return 1;

    //     //vertically placed -->
    //     int vert = placeTiles(n-m,m);
    //     //horizontally placed-->
    //     int hori = placeTiles(n-1, m);
    //     return vert+hori;
    // }
    // public static void main(String args[]){
    //     int res = placeTiles(4, 2);
    //     System.out.println(res);
    // }

    //QU: find the number of ways in which you can invite n people to your party single or in pair
    // public static int call(int n){
    //     if(n == 1){
    //         return 1;
    //     }

    //     //Single -->
    //     int ways1 = call(n-1);
    //     //Pair -->
    //     int ways2 = (n-1) * call(n-2);

    //     return ways1 + ways2;
    // }
    // public static void main(String args[]){
    //     int res = call(3);
    //     System.out.println(res);
    // }

    //Qu : Print all the subset of a set of first n natural numbers -->
    // public static void sub(int n,ArrayList<Integer> subset){
    //     if( n== 0){
    //         System.out.println(subset);
    //         return;
    //     }
    //     //TO be -->
    //     subset.add(n);
    //     sub(n-1,subset);
    //     //not to be-->
    //     subset.remove(subset.size()-1);
    //     sub(n-1,subset);
    // }
    // public static void main(String args[]){
    //     ArrayList<Integer> subset = new ArrayList<>();
    //     sub(3,subset);
    // }
}
