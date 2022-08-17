public class CLL{
    private Node head;
    private Node tail;
    private int size;

    CLL(){
        this.size=0;
        this.head=null;
        this.tail=null;
    }

    void insert(int val){
        Node node = new Node(val);
        if(head==null){//empty
            head=node;
            tail=node;
            size+=1;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
        size+=1;
    }

    void delete(int val){
        Node prev = null;
        if(head!=null){
            if(val==head.val){
                tail.next=head.next;
                head=head.next;
                size-=1;
                return;
            }

            if(val==tail.val){
                Node temp = head;
                for(int i=1;i<size-1;i++){
                    temp=temp.next;
                }
                temp.next=head;
                tail=temp;
                size-=1;
                return;
            }

            Node temp = head;
            while(temp.val!=val){
                prev=temp;
                temp=temp.next;
            }
            prev.next=temp.next;
            size-=1;
            return;
        }
    }

    void display(){
        Node temp=head;
        if(head!=null){
            do{
                System.out.print(temp.val + " -> ");
                temp=temp.next;
            }while(temp!=head);
        }
        System.out.print(tail.next.val + " -> ");
        System.out.print("END");
    }

    private class Node{
        private int val;
        private Node next;
        public Node(int val){
            this.val=val;
        }
    }
}