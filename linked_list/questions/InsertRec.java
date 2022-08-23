class LL {
    private Node head;
    private Node tail;
    private int size;
    LL(){
        this.size=0;
    }    

    void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    void ins(int idx, int val){
        head = insert(idx, val, head);
    }

    Node insert(int idx, int val, Node node){   
        if(idx==0){
            Node newNode = new Node(val, node);
            size+=1;
            return newNode;
        }
        node.next = insert(idx-1, val, node.next);
        return node;
    }

    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp=temp.next;
        }
        System.out.print("END");
    }

    private class Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
}
public class InsertRec {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(9);
        list.insertFirst(7);
        list.insertFirst(5);
        list.insertFirst(3);

        list.ins(2, 19);

        list.display();
    }   
}
