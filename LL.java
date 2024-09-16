import java.util.*;
//build a linked list from scratch -->
class LL{
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    //Add Operation -->
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head= newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }
    //Print Operation --->
    public void printList(){
        Node curr = head;
        if(head == null){
            System.out.println("List is empty");
        }
        while(curr.next != null){
            System.out.print(curr.data+"-->");
            curr = curr.next;
        }
        System.out.print(curr.data+"-->NULL");
        System.out.println();
    }
    //Deletion -->
    public void removeFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }
    public void removeLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node last = head.next;
        while(last.next != null){
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    //Reverse a List -->
    public void reverseList(){
        if(head == null || head.next == null){
            return;
        }
        Node prev = head;
        Node curr = head.next;
        while(curr != null){
            Node n = curr.next;
            curr.next = prev;
            //Update -->
            prev = curr;
            curr = n;
        }
        head.next = null;
        head = prev;
    }
    public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    //Most important Question -->
    //1 . find and remove nth node from last -->
    public Node removeNthFromLast(int n){
        if(head == null){
            return head;
        }
        int size = 0;
        Node curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        if(n == size){
            head =  head.next;
            return head;
        }
        int idxToSearch = size - n;
        int i = 1;
        Node prev = head;
        while( i < idxToSearch){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
    //2.Palindrome linked list ->
    public boolean isPalindrome(){
        if(head == null || head.next == null){
            return 
            true;
        }
        Node mid = findMid();
        Node secondHalfStart = reverseList(mid.next);

        //Compare -->
        Node firstHalfStart = head;
        while(secondHalfStart != null){
            if(firstHalfStart.data != secondHalfStart.data){
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }
    public Node findMid(){
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public Node reverseList(Node head){
        Node prev = head;
        Node curr = head.next;
        while(curr != null){
            Node n = curr.next;
            curr.next = prev;
            prev = curr;
            curr = n;
        }
        // head.next = null;
        return prev;
    }
    //3 Detect a cycle -->
    public boolean hasCycle(){
        if(head == null || head.next == null){
            return false;
        }
        Node slow = head;
        Node fast = head;
        while(slow != fast && fast.next!=null){
            slow = slow.next;
            fast= fast.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        LL list = new LL();
        list.addFirst("this");
        list.addFirst("is");
        // list.printList();
        list.addFirst("this");
        list.printList();
        // list.reverseList();
        // list.head = list.reverseRecursive(list.head);
        // list.printList();
        // list.removeFirst();
        // list.printList();
        // list.removeLast();
        // list.printList();
        // Node newHead = list.removeNthFromLast(3);
        // System.out.println(list.isPalindrome());
        // System.out.println(list.hasCycle());
        list.printList();
    }
}

// Build a Linked list using collection frameworks -->
// class LL{
//     public static void main(String args[]){
//         LinkedList<String> list = new LinkedList<>();
//         list.addFirst("this");
//         list.addLast("is");
//         list.addLast("a");
//         System.out.println(list);
//         list.removeLast();
//         list.removeFirst();
//         System.out.println(list);
//         list.addLast("a");
//         list.addLast("list");
//         list.addFirst("this");
//         System.out.println(list);
//         // list.remove(2);//remove using index
//         System.out.println(list);
//         //get size of list-->
//         System.out.println(list.size());
//     }
// }