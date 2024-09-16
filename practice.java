//Java arrays -->
//In java the arrays are the collection of same type of values
//in java lang if we declare a variable , in memory it is intialized as int->0 , float->0.0,boolean->false,string->""
//if we print the array without its index the output will be some garbage value.
import java.util.*;
// class practice{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of array");
//         int size = sc.nextInt();
//         int marks[] = new int[size];
//         System.out.println("Enter the values you want to store in array");
//         for(int i=0;i<size;i++){
//             marks[i] = sc.nextInt();
//         }
//         System.out.println("these are the items of your array");
//         for(int i=0;i<size;i++){
//             System.out.println(marks[i]);
//         }
//     }
// }

//2D Arrays in java --> 2D arrays are collection of 1D arrays these are stored in memory same
//as 1D array and represented as a matrix.
// class practice{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the size of row");
//         int row = sc.nextInt();
//         System.out.println("Enter the size of column");
//         int col = sc.nextInt();

//         //declaration -->
//         int[][] arr = new int[row][col];
//         System.out.println("Enter the values to store in the 2D array");
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("These are the items of your 2D array");
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 System.out.println(arr[i][j]);
//             }
//         }
//         System.out.println("Enter the number which do you want to find in array");
//         int find = sc.nextInt();
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 if(arr[i][j] == find){
//                     System.out.println("index is" + "["+ i + ", " + j + "]");
//                 }
//             }
//         }

//     }
// } 

//functions in java-->
// class program{
//     public static void ex(String s){
//         System.out.println(s);
//     }
    
//     public static int fact(int num){
//         int res = num;
//         for(int i=num-1;i>1;i--){
//             res *= i;
//         }
//         return res;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         // String s = sc.next();
//         // ex(s);
//         int num = sc.nextInt();
//         System.out.println(fact(num));
//     }
// }

//Patterns -->
// class practice{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of rows and columns");
//         int row = sc.nextInt();
//         int col = sc.nextInt();
        //solid rectangle-->
        // for(int i=1;i<=row;i++){
        //     for(int j=1;j<=col;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println(" ");
        // }

        //Hollow Rectangle-->
        // for(int i=1;i<=row;i++){
        //     for(int j=1;j<=col;j++){
        //         if(i==1 || j == 1 || i==row || j==col){
        //             System.out.print("* ");
        //         }else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

        //Half Pyramid -->
        // for(int i=1;i<=row;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //Inverted Half Pyramid -->
        // for(int i=row;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println(" ");
        // }

        //Inverted Half Pyramid (Rotated at 180 degree)-->
        // for(int i=1;i<=row;i++){
        //     //inner loop for spaces -->
        //     for(int j=1;j<=row-i;j++){
        //         System.out.print("  ");
        //     }
        //     //inner loop for star-->
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //Number Pattern -->
        // for(int i=1;i<=row;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println("  ");
        // }

        //inverted number pattern -->
        // for(int i=row;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println("  ");
        // }

        //Floyd's Triangle -->
        // int num =1;
        // for(int i=1;i<=row;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(num+" ");
        //         num++;
        //     }
        //     System.out.println("  ");
        // }

        //0-1 Triangle -->
        // for(int i=1;i<=row;i++){
        //     for(int j=1;j<=i;j++){
        //         if((i+j)%2 == 0){
        //             System.out.print("1 ");
        //         }else{
        //             System.out.print("0 ");
        //         }
        //     }
        //     System.out.println("  ");
        // }

        //Advanced patterns -->

        //1 Butterfly pattern-->
        //first half-->
        // for(int i=1;i<=row;i++){
        //     //for stars-->
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     //for spaces -->
        //     int spaces  = 2 * (row-i);
        //     for(int j=1;j<=spaces;j++){
        //         System.out.print("  ");
        //     }
        //     //for stars -->
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // //2nd half-->
        // for(int i=row;i>=1;i--){
        //     //for stars-->
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     //for spaces -->
        //     int spaces = 2 * (row-i);
        //     for(int j=1;j<=spaces;j++){
        //         System.out.print("  ");
        //     }
        //     //for stars -->
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //2 solid Rhombus-->
        // for(int i=1;i<=row;i++){
        //     //for spaces -->
        //     for(int j=1;j<=row-i;j++){
        //         System.out.print("  ");
        //     }
        //     //for stars -->
        //     for(int j=1;j<=row;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //Number Pyramid -->
        // for(int i=1;i<=row;i++){
        //     //for spaces-->
        //     for(int j=1;j<=row-i;j++){
        //         System.out.print(" ");
        //     }
        //     //for numbers-->
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        //3 palindromic pattern-->
        // for(int i=1;i<=row;i++){
        //     //for spaces-->
        //     for(int j=1;j<=row-i;j++){
        //         System.out.print("  ");
        //     }
        //     //for half number pattern -->
        //     for(int j=i;j>=1;j--){
        //         System.out.print(j+" ");
        //     }
        //     //for second half pyramid-->
        //     for(int j=2;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
//     }
// }

//Strings -->
// class program{
    // public static void main(String args[]){
        //Strings are non primitive data type , group of characters , string are immutable in java
        //declaration-->
        // String name = "raghav sharma";
        // //taking input string from user-->
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name");
        // // String n = sc.next();
        // //If user inputs a sentence or his name with white spaces the .next() function will take
        // //only a word from that sentence if we want to get whole sentence use .nextLine() function
        // String n = sc.nextLine();
        // System.out.println(n);

        // //to check length of String-->
        // System.out.println(n.length());
        // //compare two string -->
        // System.out.println(name.compareTo(n));

        // // taking a substring from a string-->
        // System.out.println(n.substring(7,n.length()));

        // //to get a character at any index in string -->
        // System.out.println(n.charAt(2));

        //String Builder class fro string -->
        // StringBuilder sb = new StringBuilder("jack");
        
        //functions of StringBuilder class-->
        //set char at a index -->
        // sb.setCharAt(0,'l');
        // System.out.println(sb);

        //Insert Function-->
        // sb.insert(0,'b');
        // System.out.println(sb);

        //delete operation-->
//         sb.delete(0,1);
//         System.out.println(sb);

//         //Append chars-->
//         sb.append("s");
//         System.out.println(sb);

//         //reverse string -->
//         int len = sb.length();
//         for(int i=len-1;i>=0;i--){
//             sb.append(sb.charAt(i));
//         }
//         sb.delete(0, len);
//         System.out.println(sb);
//     }
// }

class program{
    public static void main(String args[]){
        //Bit masking --> performing any operation such as get set clear , update on a
        //number is called bit masking 
        //BitMask --> an additional number is used to perform bitmasking which is called 
        //bitmap bitmap->1<<i(position)
        
        // four major operation in bitmasking-->(get,set,clear,update)

        //1-->get operation : getting a bit at a position
        //bitmap:1<<pos
        //operation : Bitwise AND

        // int n = 5;//0101
        // int pos = 3;
        // int bm = 1 << pos;
        // if((bm & n) == 0){
        //     System.out.println("bit is zero");
        // }else{
        //     System.out.println("Bit is one");
        // }

        //2 Set operation --> setting a zero bit to 1
        //Bitmap : 1 << pos;
        //Operation :  Bitwise OR
        // int n = 5;//0101
        // int pos = 3;
        // int bm = 1 << pos;
        // int res = bm | n;
        // System.out.println(res);

        //3 clear bit operation --> converting a 1bit to 0
        // Bitmask : 1 << pos
        //operation : AND with NOT
        // int n = 5;//0101
        // int pos = 0;
        // int bm = 1 << pos;
        // bm = ~(bm); //Perform not operation
        // int res = bm & n;
        // System.out.println(res);

        //4 UPdate Operation --> update a bit at a position 
        //for converting to 0 -->
        //bitmask : 1<<pos
        //operation : AND with NOT(clear operation)
        //for converting to 1 -->
        //bitmask : 1<<pos
        //operation : OR (Set operation)
        Scanner sc = new Scanner(System.in);
        System.out.println("do you want to convert to 1 or 0");
        int ope = sc.nextInt();
        System.out.println("in which position do you want to update");
        int pos = sc.nextInt();
        int n = 5;//0101
        int bm = 1<<pos;
        if(ope == 0){
            bm = ~(bm);
            int res = bm & n;
            System.out.println(res);
        }else{
            int res = bm | n;
            System.out.println(res);
        }
    }
}