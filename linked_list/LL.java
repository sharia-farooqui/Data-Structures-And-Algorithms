public class LL{

    private Node head;
    private Node tail;
    private int size;

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

    void insert(int val, int idx){
        if(idx==0){
            insertFirst(val);
            return;
        }
        if(idx==size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i=1;i<idx;i++){
            temp=temp.next;
        }
        Node node=new Node(val, temp.next); //for the newly created node, next will be old next of current temp 
        temp.next=node;
        size+=1;
    }

    void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head; 
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next=node;
        size+=1;
        return;
    }

    void insertLastWTail(int val){
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size+=1;
    }

    int deleteFirst(){
        int val = head.val;
        head=head.next;
        if(head==null){ //no element
            tail=null;
        }
        size-=1;
        return val;
    }

    void delete(int key){
        Node temp = head;
        Node prev = null;
        if(temp!=null&&temp.val==key){ //first element to be deleted
            head=temp.next;
            return;
        }
        while(temp!=null&&temp.val!=key){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
    }

    int deleteLast(){
        Node temp = head;
        for(int i=1;i<size-1;i++){
            temp=temp.next;
        }
        Node deleted_val = temp.next;
        temp.next=null;
        return deleted_val.val;
    }
 
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    private class Node{
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