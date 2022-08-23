class LL{

    public Node head;
    public Node tail;
    public int size;

    LL(){
        this.size=0;
    }

    void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node; //head always points to the first node

        if(tail==null){
            tail=head; //single element exists in LL
        }
        size+=1;
    }
    
    void reverse(){
        Node temp = head;
        reverseRecursion(temp);
    }
    
    void reverseRecursion(Node temp){
        if(temp==tail){
            head=temp;
            return;
        }
        reverseRecursion(temp.next);
        tail.next=temp;
        tail=temp;
        tail.next=null;
    }
    
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public class Node{
        private int val;
        private Node next; //private so cannot be accessed directly

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
}

public class ReverseRecursion{
    public static void main (String[] args) {
        LL list = new LL();
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.display();
        list.reverse();
        System.out.println("After Reversing : ");
        list.display();
    }
}