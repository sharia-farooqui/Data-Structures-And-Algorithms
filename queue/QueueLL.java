public class QueueLL {

    private Node front; //head
    private Node rear; //tail
    private int size;

    QueueLL(){
        this.size=0;
    }

    public void display(){
        if(front==null&&rear==null){
            System.out.println("Queue is empty");
        }
        else{
            Node temp=front;
            while(temp!=rear.next){
                System.out.print(temp.val + " -> ");
                temp=temp.next;
            }
            System.out.println("NULL");
        }
    }
    
    public void enqueue(int val){
        Node newNode = new Node(val);
        if(rear==null){
            front=newNode;
            rear=newNode;
        }
        else{
            rear.next=newNode;
            rear=newNode;
        }
    }

    public void dequeue(){
        if(front==null){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(front.val);
        front=front.next;
        if(front==null){
            rear=null;
        }
    }

    public void peek(){
        if(front==null&&rear==null){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println(front.val);
        }
    }

    private class Node{
        private int val;
        private Node next;
        public Node(int val){
            this.val=val;
        }
    }

    public static void main(String[] args) {
        QueueLL queue = new QueueLL();
        queue.display();
        queue.enqueue(23);
        queue.enqueue(43);
        queue.display();
        queue.peek();
        queue.dequeue();
        queue.display();
        queue.peek();
        queue.dequeue();
        queue.display();
        queue.dequeue();
    }

}
