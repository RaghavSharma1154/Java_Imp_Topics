import java.util.*;
//Implementations -->
//Queue using Array -->
// public class QueueC{
//     static class Queue{
//         static int arr[];
//         static int size;
//         Queue(int size){
//             arr = new int[size];
//             this.size = size;
//         }
//         static int rear = -1;
//         public static boolean isEmpty(){
//             return rear == -1;
//         }
//         //Enqueue Operation -->
//         public static void add(int data){
//             if(rear == size -1){
//                 System.out.println("data Overflow");
//                 return;
//             }
//             rear++;
//             arr[rear] = data;
//         }
//         //Deque Operation -->
//         public static int remove(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int front =arr[0];
//             for(int i=0;i<rear;i++){
//                 arr[i] = arr[i+1];
//             }
//             rear--;
//             return front;
//         }
//         //peek Operation -->
//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return arr[0];
//         }

//     }
//     public static void main(String args[]){
//         Queue q = new Queue(5);
//         q.add(23);
//         q.add(12);
//         q.add(34);
//         q.add(45);
//         while(!q.isEmpty()){
//             System.out.println(q.remove());
//         }
//     }
// }

//Circular Queue using array -->
// public class QueueC{
//     static class Queue{
//         static int arr[];
//         static int size;
//         Queue(int size){
//             arr = new int[size];
//             this.size = size;
//         }
//         static int rear = -1;
//         static int front = -1;
//         public static boolean isEmpty(){
//             return rear == -1 && front == -1;
//         }
//         public static boolean isFull(){
//             return ((rear+1)% size == front);
//         }
//         //Enqueue -->
//         public static void add(int data){
//             if(isFull()){
//                 return;
//             }
//             if(isEmpty()){
//                 front  = (front+1) % size;
//             }
//             rear = (rear+1)% size;
//             arr[rear] = data;
//         }
//         //Dequeue -->
//         public static int remove(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int res =arr[front];
//             if(front == rear){
//                 front  = rear = -1;
//             }else{
//                 front = (front+1)%size;
//             }
//             return res;
//         }
//         //peek -->
//         public static int peek(){
//             if(!isEmpty()){
//                 return arr[front];
//             }
//             return -1;
//         }
//     }
//     public static void main(String args[]){
//         Queue q = new Queue(3);
//         q.add(23);
//         q.add(12);
//         q.add(79);
//         q.remove();
//         q.add(1);
//         while(!q.isEmpty()){
//             System.out.println(q.remove());
//         }
//     }

// }

//Queue using Linked list -->
// public class QueueC{
//     static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     static class Queue{
//         static Node head  = null;
//         static Node tail = null;
//         //isEmpty --> 
//         public static boolean isEmpty(){
//             return head == null && tail == null;
//         }
//         //Enqueue -->
//         public static void add(int data){
//             Node newNode = new Node(data);
//             if(tail == null){
//                 head = tail = newNode;
//                 return;
//             }
//             tail.next = newNode;
//             tail = newNode;
//         }
//         //Dequeue -->
//         public static int remove(){
//             if(isEmpty()){
//                 return -1;
//             }
//             if(head == tail){
//                 tail = null;
//             }
//             int res = head.data;
//             head = head.next;
//             return res;
//         }
//         //Peek -->
//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return head.data;
//         }   
//     }
//     public static void main(String args[]){
//         Queue q = new Queue();
//         q.add(12);
//         q.add(2);
//         q.add(13);
//         q.add(7);
//         q.add(19);
//         q.remove();
//         q.add(34);
//         while(!q.isEmpty()){
//             System.out.println(q.remove());
//         }
//     }
// }

//implementation using collection frameworks -->

public class QueueC {
    public static void main(String args[]){
        // Queue<Integer> q = new LinkedList<>();
        // q.add(23);
        // q.add(34);
        // q.add(12);
        // q.add(9);
        // while (!q.isEmpty()) {
        //     System.out.println(q.remove());
        // }

        //2nd method -->
        Queue<Integer> q = new ArrayDeque<>();
        q.add(23);
        q.add(2);
        q.add(3);
        q.add(33);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }     
}