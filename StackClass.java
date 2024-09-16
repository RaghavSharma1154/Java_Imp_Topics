import java.util.Stack;

public class StackClass {

    //Stack basic questions -->
    //1. push at the bottom of stack -->
    public static void pushAtBottom(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }
    //2. Reverse a stack -->
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }
    public static void main(String args[]){
        Stack<Integer> s  = new Stack<>();
        s.push(54);
        s.push(34);
        s.push(64);
        s.push(84);
        //push data to bottom of stack-->
        // pushAtBottom(23, s);
        // pushAtBottom(12, s);
        //reverse Stack -->
        reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
