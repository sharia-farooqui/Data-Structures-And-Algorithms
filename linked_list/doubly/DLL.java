public class DLL{
    private Node head;
    private Node tail;
    private int size;
    
    DLL(){
        this.size=0;
    }
    
    void insertFirst(int val){
        Node node = new Node(val);
        node.prev=null;
        node.next=head;
        // head.prev=node; if head=null, check null pointer exception
        if(head!=null){
            head.prev=null;
        }
        head=node;
        if(tail==null){
            tail=head; //single element exists in LL
        }
        size+=1;
    }

    void insert(int key, int val){
        Node temp = head;
        while(temp.val!=key){
            temp=temp.next;
        }
        Node node = new Node(val);
        node.next=temp.next;
        temp.next=node;
        node.prev=temp;
    }

    void insertLast(int val){
        Node node = new Node(val);
        Node temp = head;

        node.next=null; //because inserting at last

        if(head==null){
            node.prev=null;
            head=node;
            return;
        }

        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;
        size+=1;
    }

    void display(){
        Node temp = head;
        // Node tail = null;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp=temp.next;
            // tail=temp;
        }
        System.out.println("END");
    }

    private class Node{
        private Node prev;
        private int val;
        private Node next;

        public Node(int val){
            this.val=val;
        }
    }
}